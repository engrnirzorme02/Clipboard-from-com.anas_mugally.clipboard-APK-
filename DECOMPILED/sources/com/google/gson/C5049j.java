package com.google.gson;

import java.util.Set;
import p367u5.C7195z;

/* JADX INFO: renamed from: com.google.gson.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5049j extends AbstractC5028g {

    /* JADX INFO: renamed from: a */
    private final C7195z f19231a = new C7195z(false);

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C5049j) && ((C5049j) obj).f19231a.equals(this.f19231a);
        }
        return true;
    }

    public int hashCode() {
        return this.f19231a.hashCode();
    }

    /* JADX INFO: renamed from: n */
    public void m22789n(String str, AbstractC5028g abstractC5028g) {
        C7195z c7195z = this.f19231a;
        if (abstractC5028g == null) {
            abstractC5028g = C5030i.f19086a;
        }
        c7195z.put(str, abstractC5028g);
    }

    /* JADX INFO: renamed from: p */
    public Set m22790p() {
        return this.f19231a.entrySet();
    }
}
