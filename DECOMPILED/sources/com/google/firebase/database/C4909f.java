package com.google.firebase.database;

import p030D4.C0198b;
import p030D4.InterfaceC0210n;
import p374v4.C7231B;
import p374v4.C7245j;
import p374v4.C7254s;

/* JADX INFO: renamed from: com.google.firebase.database.f */
/* JADX INFO: loaded from: classes.dex */
public class C4909f {

    /* JADX INFO: renamed from: a */
    private final C7254s f18634a;

    /* JADX INFO: renamed from: b */
    private final C7245j f18635b;

    C4909f(InterfaceC0210n interfaceC0210n) {
        this(new C7254s(interfaceC0210n), new C7245j(""));
    }

    /* JADX INFO: renamed from: a */
    InterfaceC0210n m22122a() {
        return this.f18634a.m32100a(this.f18635b);
    }

    /* JADX INFO: renamed from: b */
    public Object m22123b() {
        return m22122a().getValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4909f)) {
            return false;
        }
        C4909f c4909f = (C4909f) obj;
        return this.f18634a.equals(c4909f.f18634a) && this.f18635b.equals(c4909f.f18635b);
    }

    public String toString() {
        C0198b c0198bM32004z = this.f18635b.m32004z();
        StringBuilder sb = new StringBuilder();
        sb.append("MutableData { key = ");
        sb.append(c0198bM32004z != null ? c0198bM32004z.m992d() : "<none>");
        sb.append(", value = ");
        sb.append(this.f18634a.m32101b().mo1001N(true));
        sb.append(" }");
        return sb.toString();
    }

    private C4909f(C7254s c7254s, C7245j c7245j) {
        this.f18634a = c7254s;
        this.f18635b = c7245j;
        C7231B.m31893g(c7245j, m22123b());
    }
}
