package p030D4;

import java.util.Collections;
import java.util.Iterator;
import p374v4.C7245j;

/* JADX INFO: renamed from: D4.g */
/* JADX INFO: loaded from: classes.dex */
public class C0203g extends C0199c implements InterfaceC0210n {

    /* JADX INFO: renamed from: e */
    private static final C0203g f901e = new C0203g();

    private C0203g() {
    }

    /* JADX INFO: renamed from: w */
    public static C0203g m1050w() {
        return f901e;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: E */
    public InterfaceC0210n mo999E(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        return (interfaceC0210n.isEmpty() || c0198b.m996q()) ? this : new C0199c().mo999E(c0198b, interfaceC0210n);
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: H */
    public boolean mo1000H() {
        return false;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: L */
    public String mo982L(InterfaceC0210n.b bVar) {
        return "";
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: N */
    public Object mo1001N(boolean z7) {
        return null;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: Q */
    public Iterator mo1002Q() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: R */
    public boolean mo1003R(C0198b c0198b) {
        return false;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: S */
    public String mo1004S() {
        return "";
    }

    @Override // p030D4.C0199c
    public boolean equals(Object obj) {
        if (obj instanceof C0203g) {
            return true;
        }
        if (!(obj instanceof InterfaceC0210n)) {
            return false;
        }
        InterfaceC0210n interfaceC0210n = (InterfaceC0210n) obj;
        return interfaceC0210n.isEmpty() && mo1006i().equals(interfaceC0210n.mo1006i());
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: f */
    public int mo1005f() {
        return 0;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    public Object getValue() {
        return null;
    }

    @Override // p030D4.C0199c
    public int hashCode() {
        return 0;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: i */
    public InterfaceC0210n mo1006i() {
        return this;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    public boolean isEmpty() {
        return true;
    }

    @Override // p030D4.C0199c, java.lang.Iterable
    public Iterator iterator() {
        return Collections.EMPTY_LIST.iterator();
    }

    @Override // p030D4.C0199c, java.lang.Comparable
    /* JADX INFO: renamed from: k */
    public int compareTo(InterfaceC0210n interfaceC0210n) {
        return interfaceC0210n.isEmpty() ? 0 : -1;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: l */
    public InterfaceC0210n mo1008l(C0198b c0198b) {
        return this;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: r */
    public InterfaceC0210n mo1013r(C7245j c7245j) {
        return this;
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: s */
    public C0198b mo1014s(C0198b c0198b) {
        return null;
    }

    @Override // p030D4.C0199c
    public String toString() {
        return "<Empty Node>";
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: u */
    public InterfaceC0210n mo1015u(C7245j c7245j, InterfaceC0210n interfaceC0210n) {
        if (c7245j.isEmpty()) {
            return interfaceC0210n;
        }
        C0198b c0198bM32004z = c7245j.m32004z();
        return mo999E(c0198bM32004z, mo1008l(c0198bM32004z).mo1015u(c7245j.m31996C(), interfaceC0210n));
    }

    @Override // p030D4.C0199c, p030D4.InterfaceC0210n
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public C0203g mo981G(InterfaceC0210n interfaceC0210n) {
        return this;
    }
}
