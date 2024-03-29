package application;


import java.sql.*;


public class LoginModel {
	
	Connection conection;
	
	public LoginModel() {
		conection = SqliteConnection.Connector();
		if (conection == null) {
			System.out.println("Connection not successful");
			System.exit(1);
		}
	}
	
	public boolean isDBConnected() {
		try {
			return !conection.isClosed();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean isLogin(String user, String pass) throws SQLException {
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from user where username = ? and password = ?";
		try {
			preparedStatement = conection.prepareStatement(query);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				return true;
			}
			
			else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			preparedStatement.close();
			resultSet.close();
		}
	}
}