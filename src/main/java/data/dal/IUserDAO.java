package data.dal; // Data access layer

import data.dto.UserDTO;

import java.util.List;

public interface IUserDAO {

    UserDTO getUser(int userId) throws DALException;
    List<UserDTO> getUserList() throws DALException;


    /**
     * Saves user to storage.
     * @param user
     * @throws DALException
     */
    void createUser(UserDTO user) throws DALException;
    void updateUser(UserDTO user) throws DALException;
    void deleteUser(int userId) throws DALException;

    class DALException extends Exception {

        /**
         *
         */
        private static final long serialVersionUID = 7355418246336739229L;

        public DALException(String msg, Throwable e) {
            super(msg,e);
        }

        public DALException(String msg) {
            super(msg);
        }
    }
}
