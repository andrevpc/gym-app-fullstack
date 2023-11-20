import React from 'react';
import { View, Text, Image, Button, TouchableOpacity } from 'react-native';
import styles from './styles';

const Card = ({ title, body, img }) => {

    return (
        <View style={styles.card}>
            <div style={{
                display: "flex"
            }}>
                <Image
                    source={img}
                    style={styles.img}
                />
                <div style={{
                    display: "flex",
                    flexDirection: "column"
                }}>
                    <Text style={styles.cardTitle}>{title}</Text>
                    <Text style={styles.cardBody}>{body}</Text>
                    <TouchableOpacity style={styles.btn} title="Fazer" onPress={console.log("AA")}>
                        <Text style={styles.btnTxt}>Fazer</Text>
                    </TouchableOpacity>
                </div>
            </div>
        </View>
    );
};

export default Card;