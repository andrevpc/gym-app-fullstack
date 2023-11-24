import React, { useState } from 'react';
import {
    View,
    Text,
    TextInput,
    Button,
    ImageBackground,
    Image,
    Touchable
} from 'react-native';
import styles from "./styles";
import useBind from "../../hooks/useBind";
import bgImg from '../../../assets/images/background.png'
import logoImg from '../../../assets/images/logo.png'
import { TouchableOpacity } from 'react-native-web';
import axios from 'axios';

const RegisterPage = (props) => {
    const [email, bindEmail, resetEmail] = useBind("")
    const [username, bindUsername, resetUsername] = useBind("")
    const [password, bindPassword, resetPassword] = useBind("")

    const resetAll = () => {
        resetEmail()
        resetUsername()
        resetPassword()
    }

    const handleRegister = (async () => {
        const registerData = {
            name: username,
            email: email,
            password: password
        };

        try {
            const res = await axios.post("http://localhost:8080/user", registerData);
            resetAll()
            props.navigation.navigate('login')
        } catch (error) {
            console.log(error)
        }
    });

    return (
        <View style={styles.container}>
            <ImageBackground
                source={bgImg}
                style={styles.backgroundImage}
            />
            <View style={styles.centerDiv} />
            <Image
                source={logoImg}
                style={styles.img}
            />
            <TextInput
                style={styles.input}
                placeholder="Username"
                {...bindUsername}
            />
            <TextInput
                style={styles.input}
                placeholder="Email"
                {...bindEmail}
            />
            <TextInput
                style={styles.input}
                placeholder="Senha"
                {...bindPassword}
                secureTextEntry
            />
            <TouchableOpacity style={styles.btn} title="Entrar" onPress={() => handleRegister()}>
                <Text style={styles.btnTxt}>Registrar</Text>
            </TouchableOpacity>
            <View style={styles.footerView}>
                <Text style={styles.footerText}>Já possui uma conta? </Text>
                <Text style={styles.footerText} onPress={() => props.navigation.navigate('login')}>Entrar na conta</Text>
            </View>
        </View>
    );
};

export default RegisterPage;