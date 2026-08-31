package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfd implements Comparator {
    zzfd() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
