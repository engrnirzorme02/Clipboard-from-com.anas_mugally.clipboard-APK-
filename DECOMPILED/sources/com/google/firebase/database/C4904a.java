package com.google.firebase.database;

import p030D4.C0205i;
import p374v4.C7245j;

/* JADX INFO: renamed from: com.google.firebase.database.a */
/* JADX INFO: loaded from: classes.dex */
public class C4904a {

    /* JADX INFO: renamed from: a */
    private final C0205i f18621a;

    /* JADX INFO: renamed from: b */
    private final C4905b f18622b;

    C4904a(C4905b c4905b, C0205i c0205i) {
        this.f18621a = c0205i;
        this.f18622b = c4905b;
    }

    /* JADX INFO: renamed from: a */
    public C4904a m22100a(String str) {
        return new C4904a(this.f18622b.m22108e(str), C0205i.m1061b(this.f18621a.m1066k().mo1013r(new C7245j(str))));
    }

    /* JADX INFO: renamed from: b */
    public boolean m22101b() {
        return !this.f18621a.m1066k().isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public String m22102c() {
        return this.f18622b.m22109f();
    }

    /* JADX INFO: renamed from: d */
    public C4905b m22103d() {
        return this.f18622b;
    }

    /* JADX INFO: renamed from: e */
    public Object m22104e() {
        return this.f18621a.m1066k().getValue();
    }

    /* JADX INFO: renamed from: f */
    public Object m22105f(boolean z7) {
        return this.f18621a.m1066k().mo1001N(z7);
    }

    /* JADX INFO: renamed from: g */
    public boolean m22106g() {
        return this.f18621a.m1066k().mo1005f() > 0;
    }

    public String toString() {
        return "DataSnapshot { key = " + this.f18622b.m22109f() + ", value = " + this.f18621a.m1066k().mo1001N(true) + " }";
    }
}
