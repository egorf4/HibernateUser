package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }



    public void createUsersTable() {
//    String create = "CREATE TABLE IF NOT EXISTS users ("
//            + "id INT PRIMARY KEY AUTO_INCREMENT, "
//            + "name VARCHAR(45), "
//            + "lastName VARCHAR(50), "
//            + "age INT(4))";
//        try (Connection conn = Util.getConnection()) {
//            Statement stmt = conn.createStatement();
//            stmt.execute(create);
//    } catch (SQLException e) {
//        throw new RuntimeException(e);
//    }
    }
    public void dropUsersTable() {
//    String drop = "DROP TABLE IF EXISTS users";
//        try (Connection conn = Util.getConnection();
//             Statement stmt = conn.createStatement()) {
//            stmt.execute(drop);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//    String insert = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
//
//        try (Connection conn = Util.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(insert)) {
//            stmt.setString(1, name);
//            stmt.setString(2, lastName);
//            stmt.setByte(3, age);
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void removeUserById(long id) {
//    String del = "DELETE FROM users WHERE id = ?";
//        try (Connection conn = Util.getConnection();
//             PreparedStatement stmt = conn.prepareStatement(del)) {
//            stmt.setLong(1, id);
//            stmt.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
    public List<User> getAllUsers() {
//       String select = "SELECT * FROM users";
//        List<User> users = new ArrayList<>();
//       try (Connection connection = Util.getConnection();
//           Statement stmt = connection.createStatement();
//           ResultSet rs = stmt.executeQuery(select)) {
//           while (rs.next()) {
//               User user = new User();
//               user.setId(rs.getLong("id"));
//               user.setName(rs.getString("name"));
//               user.setLastName(rs.getString("lastName"));
//               user.setAge(rs.getByte("age"));
//               users.add(user);
//           }
//       } catch (SQLException e) {
//           throw new RuntimeException(e);
//       }
//        return users;
//         }
    return null;
    }
        public void cleanUsersTable () {
//    String clean = "DELETE FROM users";
//        try (Connection conn = Util.getConnection();
//             Statement stmt = conn.createStatement()) {
//            stmt.executeUpdate(clean);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
        }
    }
