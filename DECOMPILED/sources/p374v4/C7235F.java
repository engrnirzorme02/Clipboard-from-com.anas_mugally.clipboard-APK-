package p374v4;

import java.util.Collections;
import java.util.List;
import p006A4.C0016a;
import p030D4.AbstractC0204h;
import p030D4.C0198b;
import p030D4.C0209m;
import p030D4.InterfaceC0210n;

/* JADX INFO: renamed from: v4.F */
/* JADX INFO: loaded from: classes.dex */
public class C7235F {

    /* JADX INFO: renamed from: a */
    private final C7245j f28834a;

    /* JADX INFO: renamed from: b */
    private final C7234E f28835b;

    public C7235F(C7245j c7245j, C7234E c7234e) {
        this.f28834a = c7245j;
        this.f28835b = c7234e;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0210n m31920a(C0198b c0198b, C0016a c0016a) {
        return this.f28835b.m31908c(this.f28834a, c0198b, c0016a);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0210n m31921b(InterfaceC0210n interfaceC0210n) {
        return m31922c(interfaceC0210n, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC0210n m31922c(InterfaceC0210n interfaceC0210n, List list) {
        return m31923d(interfaceC0210n, list, false);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0210n m31923d(InterfaceC0210n interfaceC0210n, List list, boolean z7) {
        return this.f28835b.m31909d(this.f28834a, interfaceC0210n, list, z7);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC0210n m31924e(InterfaceC0210n interfaceC0210n) {
        return this.f28835b.m31910e(this.f28834a, interfaceC0210n);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0210n m31925f(C7245j c7245j, InterfaceC0210n interfaceC0210n, InterfaceC0210n interfaceC0210n2) {
        return this.f28835b.m31911f(this.f28834a, c7245j, interfaceC0210n, interfaceC0210n2);
    }

    /* JADX INFO: renamed from: g */
    public C0209m m31926g(InterfaceC0210n interfaceC0210n, C0209m c0209m, boolean z7, AbstractC0204h abstractC0204h) {
        return this.f28835b.m31912g(this.f28834a, interfaceC0210n, c0209m, z7, abstractC0204h);
    }

    /* JADX INFO: renamed from: h */
    public C7235F m31927h(C0198b c0198b) {
        return new C7235F(this.f28834a.m31999p(c0198b), this.f28835b);
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC0210n m31928i(C7245j c7245j) {
        return this.f28835b.m31916n(this.f28834a.m32000q(c7245j));
    }
}
