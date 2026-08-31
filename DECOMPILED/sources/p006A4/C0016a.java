package p006A4;

import p030D4.C0198b;
import p030D4.C0205i;
import p030D4.InterfaceC0210n;
import p374v4.C7245j;

/* JADX INFO: renamed from: A4.a */
/* JADX INFO: loaded from: classes.dex */
public class C0016a {

    /* JADX INFO: renamed from: a */
    private final C0205i f91a;

    /* JADX INFO: renamed from: b */
    private final boolean f92b;

    /* JADX INFO: renamed from: c */
    private final boolean f93c;

    public C0016a(C0205i c0205i, boolean z7, boolean z8) {
        this.f91a = c0205i;
        this.f92b = z7;
        this.f93c = z8;
    }

    /* JADX INFO: renamed from: a */
    public C0205i m84a() {
        return this.f91a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0210n m85b() {
        return this.f91a.m1066k();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86c(C0198b c0198b) {
        return (m89f() && !this.f93c) || this.f91a.m1066k().mo1003R(c0198b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m87d(C7245j c7245j) {
        if (c7245j.isEmpty()) {
            return m89f() && !this.f93c;
        }
        return m86c(c7245j.m32004z());
    }

    /* JADX INFO: renamed from: e */
    public boolean m88e() {
        return this.f93c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m89f() {
        return this.f92b;
    }
}
