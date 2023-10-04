package com.driver;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;



    @Service
    public class WatsappService {


        WatsappRepository watsappRepository = new WatsappRepository();
        public String createUser(String name, String mobile) throws Exception {

            return watsappRepository.saveUser(name,mobile);


        }

        public Group createGroup(List<User> users) {
            return watsappRepository.createGroup(users);
        }

        public int createMessage(String content) {
            return watsappRepository.createMessage(content);
        }

        public int sendMessage(Message message, User sender, Group group) throws Exception {
            return watsappRepository.sendMessage(message,sender,group);
        }

        public String changeAdmin(User approver, User user, Group group)  throws Exception {
            return watsappRepository.changeAdmin(approver,user,group);
        }

        public int removeUser(User user)  throws Exception {
            return watsappRepository.removeUser(user);
        }

        public String findMessage(Date start, Date end, int k) throws Exception {
            return watsappRepository.findMessage(start,end,k);
        }
    }

