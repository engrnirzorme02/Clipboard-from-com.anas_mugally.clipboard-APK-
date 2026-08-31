package p030D4;

import java.util.Iterator;
import p374v4.C7245j;

/* JADX INFO: renamed from: D4.n */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0210n extends Comparable, Iterable {

    /* JADX INFO: renamed from: g */
    public static final C0199c f920g = new a();

    /* JADX INFO: renamed from: D4.n$a */
    class a extends C0199c {
        a() {
        }

        @Override // p030D4.C0199c, p030D4.InterfaceC0210n
        /* JADX INFO: renamed from: R */
        public boolean mo1003R(C0198b c0198b) {
            return false;
        }

        @Override // p030D4.C0199c
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // p030D4.C0199c, p030D4.InterfaceC0210n
        /* JADX INFO: renamed from: i */
        public InterfaceC0210n mo1006i() {
            return this;
        }

        @Override // p030D4.C0199c, p030D4.InterfaceC0210n
        public boolean isEmpty() {
            return false;
        }

        @Override // p030D4.C0199c, java.lang.Comparable
        /* JADX INFO: renamed from: k */
        public int compareTo(InterfaceC0210n interfaceC0210n) {
            return interfaceC0210n == this ? 0 : 1;
        }

        @Override // p030D4.C0199c, p030D4.InterfaceC0210n
        /* JADX INFO: renamed from: l */
        public InterfaceC0210n mo1008l(C0198b c0198b) {
            return c0198b.m996q() ? mo1006i() : C0203g.m1050w();
        }

        @Override // p030D4.C0199c
        public String toString() {
            return "<Max Node>";
        }
    }

    /* JADX INFO: renamed from: D4.n$b */
    public enum b {
        V1,
        V2
    }

    /* JADX INFO: renamed from: E */
    InterfaceC0210n mo999E(C0198b c0198b, InterfaceC0210n interfaceC0210n);

    /* JADX INFO: renamed from: G */
    InterfaceC0210n mo981G(InterfaceC0210n interfaceC0210n);

    /* JADX INFO: renamed from: H */
    boolean mo1000H();

    /* JADX INFO: renamed from: L */
    String mo982L(b bVar);

    /* JADX INFO: renamed from: N */
    Object mo1001N(boolean z7);

    /* JADX INFO: renamed from: Q */
    Iterator mo1002Q();

    /* JADX INFO: renamed from: R */
    boolean mo1003R(C0198b c0198b);

    /* JADX INFO: renamed from: S */
    String mo1004S();

    /* JADX INFO: renamed from: f */
    int mo1005f();

    Object getValue();

    /* JADX INFO: renamed from: i */
    InterfaceC0210n mo1006i();

    boolean isEmpty();

    /* JADX INFO: renamed from: l */
    InterfaceC0210n mo1008l(C0198b c0198b);

    /* JADX INFO: renamed from: r */
    InterfaceC0210n mo1013r(C7245j c7245j);

    /* JADX INFO: renamed from: s */
    C0198b mo1014s(C0198b c0198b);

    /* JADX INFO: renamed from: u */
    InterfaceC0210n mo1015u(C7245j c7245j, InterfaceC0210n interfaceC0210n);
}
