import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import LoginPage from './src/pages/login';
import RegisterPage from './src/pages/register';
import DaysPage from './src/pages/days';
import DayPage from './src/pages/day';
import { Provider } from 'react-redux';
import { store } from './src/redux/store';

export default function App() {
  const Stack = createStackNavigator();
  return (
    <Provider store={store}>
      <NavigationContainer>
        <Stack.Navigator>
          <Stack.Screen
            options={{
              headerTransparent: true,
              headerShown: false
            }}
            name="login" component={LoginPage}
          />
          <Stack.Screen
            options={{
              headerTransparent: true,
              headerShown: false
            }}
            name="day" component={DayPage}
          />
          <Stack.Screen
            options={{
              headerTransparent: true,
              headerShown: false
            }}
            name="days" component={DaysPage}
          />
          <Stack.Screen
            options={{
              headerTransparent: true,
              headerShown: false
            }}
            name="register" component={RegisterPage}
          />
        </Stack.Navigator>
      </NavigationContainer>
    </Provider>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
