package com.google.android.play.integrity.internal;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4784n {
    /* JADX INFO: renamed from: a */
    public static void m21929a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
