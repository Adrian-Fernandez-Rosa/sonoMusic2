import React from 'react';
import {Button, View} from 'react-native';
import {NativeModules} from 'react-native';

export const PlaySoundButton = () => {
  const playTone = () => {
    NativeModules.SoundModule.playTone(22050, 18.0); // Reproduce un tono de 440 Hz durante 1 segundo
  };

  return (
    <View>
      <Button title="Play Tone" onPress={playTone} />
    </View>
  );
};


