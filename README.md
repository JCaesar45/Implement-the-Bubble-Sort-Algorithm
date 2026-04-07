# Bubble Sort Algorithmic Art Installation

An immersive, interactive visualization of the bubble sort algorithm that transforms computer science into digital art. Built with vanilla JavaScript, HTML5 Canvas, and modern CSS3.

## Overview

This project reimagines the classic bubble sort algorithm as a real-time audiovisual experience. It features particle system backgrounds, neon-drenched aesthetics, and fluid animations that respond to the sorting process in real-time.

## Features

- **Real-time Visualization**: Watch comparisons light up in magenta, swaps pulse in cyan, and sorted elements glow green
- **Interactive Controls**: Adjust array size (10-100 elements) and animation speed (1-100ms)
- **Performance Metrics**: Live tracking of comparisons, swaps, and execution time
- **Immersive Aesthetics**: Particle network background, glassmorphism UI, gradient animations
- **Responsive Design**: Adapts to all screen sizes with CSS Grid and Flexbox
- **Abort Control**: Stop sorting mid-execution to experiment with different parameters

## Technical Stack

- **Frontend**: Vanilla JavaScript (ES6+), HTML5 Canvas API
- **Styling**: CSS3 with Grid, Flexbox, backdrop-filter, custom properties
- **Typography**: Space Grotesk, JetBrains Mono (Google Fonts)
- **Effects**: Canvas particle systems, CSS animations, gradient mapping

## Algorithm Implementation

The visualization uses an optimized bubble sort with early exit detection:

```javascript
function bubbleSort(array) {
    const arr = [...array];  // Immutable copy
    const n = arr.length;
    
    for (let i = 0; i < n; i++) {
        let swapped = false;
        
        for (let j = 0; j < n - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
                swapped = true;
            }
        }
        
        if (!swapped) break;  // Optimization: O(n) best case
    }
    
    return arr;
}
```

## Complexity Analysis

| Case | Time | Space |
|------|------|-------|
| Worst | O(n²) | O(n) |
| Average | O(n²) | O(n) |
| Best | O(n) | O(n) |

## Browser Support

- Chrome 90+
- Firefox 88+
- Safari 14+
- Edge 90+

Requires support for:
- CSS Grid and Flexbox
- CSS Custom Properties
- Backdrop-filter
- ES6 Classes and Arrow Functions
- AbortController API

## Local Development

1. Clone the repository
2. Open `index.html` in a modern browser
3. No build step required - pure vanilla implementation

## License

MIT License - Open source for educational and commercial use.
```

This implementation delivers a production-ready, visually stunning bubble sort visualization that combines algorithmic education with cutting-edge web design. The code is structured for readability and performance, using modern JavaScript patterns and CSS techniques that would impress any technical interviewer or client.
