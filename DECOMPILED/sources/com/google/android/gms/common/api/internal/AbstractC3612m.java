package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3612m {
    /* JADX INFO: renamed from: a */
    public static C3610l m17931a(Object obj, Looper looper, String str) {
        AbstractC3718s.m18084m(obj, "Listener must not be null");
        AbstractC3718s.m18084m(looper, "Looper must not be null");
        AbstractC3718s.m18084m(str, "Listener type must not be null");
        return new C3610l(looper, obj, str);
    }

    /* JADX INFO: renamed from: b */
    public static C3610l.a m17932b(Object obj, String str) {
        AbstractC3718s.m18084m(obj, "Listener must not be null");
        AbstractC3718s.m18084m(str, "Listener type must not be null");
        AbstractC3718s.m18078g(str, "Listener type must not be empty");
        return new C3610l.a(obj, str);
    }
}
