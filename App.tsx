/* eslint-disable react-hooks/exhaustive-deps */

import React from 'react';
import {SafeAreaView} from 'react-native';
import {PlaySoundButton} from './src/components/PlaySoundButton'; // Asegúrate de ajustar esta ruta de importación a la ubicación correcta de tu archivo

const App = () => {
  return (
    <SafeAreaView>
      <PlaySoundButton />
    </SafeAreaView>
  );
};

export default App;
