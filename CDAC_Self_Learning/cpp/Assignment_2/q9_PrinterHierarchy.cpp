#include<iostream>
using namespace std;

class Printer {
protected:
    string brand;
public:
    Printer(string b) {
        brand = b;
    }
};

class Scanner {
public:
    void scan() {
        cout << "Scanning" << endl;
    }
};

class Inkjet {
public:
    void inkFeature() {
        cout << "Inkjet printing" << endl;
    }
};

class AllInOne : public Printer, public Scanner, public Inkjet {
private:
    int pages;
public:
    AllInOne(string b, int p) : Printer(b) {
        pages = p;
    }

    void print() {
        cout << "Printing " << pages << " pages using " << brand << endl;
    }

    friend void show(AllInOne obj);
};

void show(AllInOne obj) {
    cout << "Brand: " << obj.brand << " Pages: " << obj.pages << endl;
}

int main() {
    AllInOne a("HP", 5);

    a.print();
    a.scan();
    a.inkFeature();

    show(a);

    return 0;
}