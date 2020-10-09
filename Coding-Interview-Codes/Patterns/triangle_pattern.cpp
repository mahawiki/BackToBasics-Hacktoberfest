/ Function to demonstrate printing pattern
void triangle(int n)
{
    // Outer loop to handle number of rows
    // n in this case
    for (int i = 0; i < n; i++) {
 
        // Inner loop to handle number of columns
        // values changing acc. to outer loop
        for (int j = 0; j <= i; j++) {
 
            // Printing stars
            cout << "* ";
        }
 
        // Ending line after each row
        cout << endl;
    }
}
 
// Driver Function
int main()
{
    int n = 5;
    triangle(n);
    return 0;
}
