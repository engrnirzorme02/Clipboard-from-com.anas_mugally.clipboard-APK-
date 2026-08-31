package io.grpc.internal;

import java.util.ArrayList;

/* JADX INFO: renamed from: io.grpc.internal.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C5768Y {

    /* JADX INFO: renamed from: a */
    private final ArrayList f22332a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public C5768Y m25762a(Object obj) {
        this.f22332a.add(String.valueOf(obj));
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C5768Y m25763b(String str, Object obj) {
        this.f22332a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f22332a.toString();
    }
}
