
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // Even total length
                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } 
                // Odd total length
                else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            } 
            // Move left
            else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } 
            // Move right
            else {
                low = partitionX + 1;
            }
        }
        throw new IllegalArgumentException();
    }
}