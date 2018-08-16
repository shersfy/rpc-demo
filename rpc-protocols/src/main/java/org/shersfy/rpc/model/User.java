package org.shersfy.rpc.model;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import com.alibaba.fastjson.JSON;

public class User implements Writable, Serializable, Cloneable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private LongWritable id;
    
    private Text username;
    
    private Text password;
    
    public User() {
        super();
    }
    

    public User(Long id, String username, String password) {
        super();
        this.id = new LongWritable(id);
        this.username = new Text(username);
        this.password = new Text(password);
    }

    public Long getId() {
        return id.get();
    }

    public void setId(Long id) {
        this.id = new LongWritable(id);
    }

    public String getUsername() {
        return username.toString();
    }

    public void setUsername(String username) {
        this.username = new Text(username);
    }

    public String getPassword() {
        return password.toString();
    }

    public void setPassword(String password) {
        this.password = new Text(password);
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }


    @Override
    public void write(DataOutput out) throws IOException {
        id.write(out);
        username.write(out);
        password.write(out);
    }


    @Override
    public void readFields(DataInput in) throws IOException {
        id.readFields(in);
        username.readFields(in);
        password.readFields(in);
    }
    
    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    
}
