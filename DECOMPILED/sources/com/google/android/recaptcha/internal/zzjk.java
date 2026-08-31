package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzjk implements Iterable {
    protected zzjk() {
    }

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z7 = true;
        while (it.hasNext()) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(it.next());
            z7 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
