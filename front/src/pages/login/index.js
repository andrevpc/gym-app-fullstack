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

const LoginPage = (props) => {
    const [email, bindEmail, resetEmail] = useBind("")
    const [password, bindPassword, resetPassword] = useBind("")

    const handleLogin = () => {
        console.log(email, password)
    };

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
                placeholder="Email" 
                {...bindEmail}
            />
            <TextInput
                style={styles.input}
                placeholder="Senha"
                {...bindPassword}
                secureTextEntry
            />
            <TouchableOpacity style={styles.btn} title="Entrar" onPress={handleLogin}>
                <Text style={styles.btnTxt}>Entrar</Text>
            </TouchableOpacity>
            <View style={styles.footerView}>
                <Text style={styles.footerText}>Ainda não possui uma conta? </Text>
                <Text style={styles.footerText} onPress={() => props.navigation.navigate('register')}>Criar conta</Text>
            </View>
        </View>
    );
};

export default LoginPage;