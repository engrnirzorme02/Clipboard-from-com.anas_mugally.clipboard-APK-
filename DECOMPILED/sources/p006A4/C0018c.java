package p006A4;

import p030D4.C0198b;
import p030D4.C0205i;
import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: A4.c */
/* JADX INFO: loaded from: classes.dex */
public class C0018c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC0020e.a f97a;

    /* JADX INFO: renamed from: b */
    private final C0205i f98b;

    /* JADX INFO: renamed from: c */
    private final C0205i f99c;

    /* JADX INFO: renamed from: d */
    private final C0198b f100d;

    /* JADX INFO: renamed from: e */
    private final C0198b f101e;

    private C0018c(InterfaceC0020e.a aVar, C0205i c0205i, C0198b c0198b, C0198b c0198b2, C0205i c0205i2) {
        this.f97a = aVar;
        this.f98b = c0205i;
        this.f100d = c0198b;
        this.f101e = c0198b2;
        this.f99c = c0205i2;
    }

    /* JADX INFO: renamed from: b */
    public static C0018c m92b(C0198b c0198b, C0205i c0205i) {
        return new C0018c(InterfaceC0020e.a.CHILD_ADDED, c0205i, c0198b, null, null);
    }

    /* JADX INFO: renamed from: c */
    public static C0018c m93c(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        return m92b(c0198b, C0205i.m1061b(interfaceC0210n));
    }

    /* JADX INFO: renamed from: d */
    public static C0018c m94d(C0198b c0198b, C0205i c0205i, C0205i c0205i2) {
        return new C0018c(InterfaceC0020e.a.CHILD_CHANGED, c0205i, c0198b, null, c0205i2);
    }

    /* JADX INFO: renamed from: e */
    public static C0018c m95e(C0198b c0198b, InterfaceC0210n interfaceC0210n, InterfaceC0210n interfaceC0210n2) {
        return m94d(c0198b, C0205i.m1061b(interfaceC0210n), C0205i.m1061b(interfaceC0210n2));
    }

    /* JADX INFO: renamed from: f */
    public static C0018c m96f(C0198b c0198b, C0205i c0205i) {
        return new C0018c(InterfaceC0020e.a.CHILD_MOVED, c0205i, c0198b, null, null);
    }

    /* JADX INFO: renamed from: g */
    public static C0018c m97g(C0198b c0198b, C0205i c0205i) {
        return new C0018c(InterfaceC0020e.a.CHILD_REMOVED, c0205i, c0198b, null, null);
    }

    /* JADX INFO: renamed from: h */
    public static C0018c m98h(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        return m97g(c0198b, C0205i.m1061b(interfaceC0210n));
    }

    /* JADX INFO: renamed from: m */
    public static C0018c m99m(C0205i c0205i) {
        return new C0018c(InterfaceC0020e.a.VALUE, c0205i, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public C0018c m100a(C0198b c0198b) {
        return new C0018c(this.f97a, this.f98b, this.f100d, c0198b, this.f99c);
    }

    /* JADX INFO: renamed from: i */
    public C0198b m101i() {
        return this.f100d;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC0020e.a m102j() {
        return this.f97a;
    }

    /* JADX INFO: renamed from: k */
    public C0205i m103k() {
        return this.f98b;
    }

    /* JADX INFO: renamed from: l */
    public C0205i m104l() {
        return this.f99c;
    }

    public String toString() {
        return "Change: " + this.f97a + " " + this.f100d;
    }
}
