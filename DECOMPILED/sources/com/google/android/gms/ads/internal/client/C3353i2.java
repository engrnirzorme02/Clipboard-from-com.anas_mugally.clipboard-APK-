package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p314o2.C6570v;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3353i2 {

    /* JADX INFO: renamed from: a */
    private Bundle f13965a = new Bundle();

    /* JADX INFO: renamed from: b */
    private List f13966b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private boolean f13967c = false;

    /* JADX INFO: renamed from: d */
    private int f13968d = -1;

    /* JADX INFO: renamed from: e */
    private final Bundle f13969e = new Bundle();

    /* JADX INFO: renamed from: f */
    private final Bundle f13970f = new Bundle();

    /* JADX INFO: renamed from: g */
    private final List f13971g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private int f13972h = -1;

    /* JADX INFO: renamed from: i */
    private String f13973i = null;

    /* JADX INFO: renamed from: j */
    private final List f13974j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private int f13975k = 60000;

    /* JADX INFO: renamed from: l */
    private final int f13976l = C6570v.b.DEFAULT.m27860c();

    /* JADX INFO: renamed from: m */
    private long f13977m = 0;

    /* JADX INFO: renamed from: a */
    public final C3349h2 m17232a() {
        Bundle bundle = this.f13965a;
        Bundle bundle2 = this.f13969e;
        List list = this.f13966b;
        boolean z7 = this.f13967c;
        int i7 = this.f13968d;
        int i8 = this.f13972h;
        String str = this.f13973i;
        List list2 = this.f13974j;
        int i9 = this.f13976l;
        return new C3349h2(8, -1L, bundle, -1, list, z7, i7, false, null, null, null, null, bundle2, this.f13970f, this.f13971g, null, null, false, null, i8, str, list2, this.f13975k, null, i9, this.f13977m, 0L);
    }

    /* JADX INFO: renamed from: b */
    public final C3353i2 m17233b(Bundle bundle) {
        this.f13965a = bundle;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final C3353i2 m17234c(List list) {
        this.f13966b = list;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final C3353i2 m17235d(boolean z7) {
        this.f13967c = z7;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C3353i2 m17236e(int i7) {
        this.f13968d = i7;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C3353i2 m17237f(int i7) {
        this.f13972h = i7;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final C3353i2 m17238g(String str) {
        this.f13973i = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C3353i2 m17239h(int i7) {
        this.f13975k = i7;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final C3353i2 m17240i(long j7) {
        this.f13977m = j7;
        return this;
    }
}
