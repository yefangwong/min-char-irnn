# SimpleIRNN

A minimal character-level Recurrent Neural Network that is composed of ReLUs and initialized with the identity matrix (IRNN) implementation in Java.

## Overview

This project implements a simple IRNN from scratch to learn character sequences and generate text. It demonstrates the core concepts of IRNN.

## Features

- Character-level modeling with a vocabulary built from input text.
- Single hidden layer with ReLu activation.
- Initialized hidden layer to hidden layer weight matrix with the identity matrix.
- Training with cross-entropy loss and smooth loss tracking.
- Forward and backward passes implemented manually without external ML libraries.
- Sampling method to generate text from learned probabilities.

## Usage

- Initialize the IRNN with training data (a string).
- Call the `train` method with the number of iterations to train the model.
- Use the trained model to generate text by sampling from output probabilities.

## Key Components

- Weight matrices: `wxh` (input to hidden), `whh` (hidden to hidden), `why` (hidden to output).
- Bias vectors: `bh` (hidden layer), `by` (output layer).
- Forward pass computes hidden states and output probabilities.
- Backward pass computes gradients for all parameters.
- Parameter updates use gradient descent with a fixed learning rate.

## Notes
*  ~~Sequence length is fixed to 1 for simplicity.~~ 
*  **Sequence length (SEQ_LENGTH) is now set to 25, aligning with the original Python implementation to facilitate the learning of intermediate temporal dependencies.** 
*  The recurrent logic in the `forward` pass has been corrected to ensure proper propagation of the hidden state across time steps.
- The model uses one-hot encoding for input characters.
- Random initialization of weights with small Gaussian noise but not hidden-to-hidden layer weights.
- Designed for educational purposes to understand IRNN internals.

## License

MIT License
=======
# min-char-irnn
A Java reference implementation for IRNN.
