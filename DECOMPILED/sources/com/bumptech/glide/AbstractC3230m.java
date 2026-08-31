package com.bumptech.glide;

import p169W1.C1821a;
import p169W1.InterfaceC1823c;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: com.bumptech.glide.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3230m implements Cloneable {

    /* JADX INFO: renamed from: a */
    private InterfaceC1823c f13832a = C1821a.m7572b();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC3230m clone() {
        try {
            return (AbstractC3230m) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: b */
    final InterfaceC1823c m17139b() {
        return this.f13832a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC3230m) {
            return AbstractC2023l.m8413d(this.f13832a, ((AbstractC3230m) obj).f13832a);
        }
        return false;
    }

    public int hashCode() {
        InterfaceC1823c interfaceC1823c = this.f13832a;
        if (interfaceC1823c != null) {
            return interfaceC1823c.hashCode();
        }
        return 0;
    }
}
