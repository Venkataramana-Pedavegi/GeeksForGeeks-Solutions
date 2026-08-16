int* quadraticRoots(int a, int b, int c, int* retSize) {
    int *ans = (int*)malloc(2 * sizeof(int));

    int d = b * b - 4 * a * c;

    if (d < 0) {
        ans[0] = -1;
        *retSize = 1;
        return ans;
    }

    double root1 = (-b + sqrt(d)) / (2.0 * a);
    double root2 = (-b - sqrt(d)) / (2.0 * a);

    int r1 = (int)floor(root1);
    int r2 = (int)floor(root2);

    if (r1 >= r2) {
        ans[0] = r1;
        ans[1] = r2;
    } else {
        ans[0] = r2;
        ans[1] = r1;
    }
    *retSize = 2;
    return ans;
    
}