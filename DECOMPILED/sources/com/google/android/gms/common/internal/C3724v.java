package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import p170W2.AbstractC1847l;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.v */
/* JADX INFO: loaded from: classes.dex */
public class C3724v {

    /* JADX INFO: renamed from: a */
    private final Resources f14856a;

    /* JADX INFO: renamed from: b */
    private final String f14857b;

    public C3724v(Context context) {
        AbstractC3718s.m18083l(context);
        Resources resources = context.getResources();
        this.f14856a = resources;
        this.f14857b = resources.getResourcePackageName(AbstractC1847l.f6000a);
    }

    /* JADX INFO: renamed from: a */
    public String m18102a(String str) {
        int identifier = this.f14856a.getIdentifier(str, "string", this.f14857b);
        if (identifier == 0) {
            return null;
        }
        return this.f14856a.getString(identifier);
    }
}
