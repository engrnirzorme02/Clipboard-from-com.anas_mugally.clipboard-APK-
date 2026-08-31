package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.location.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3976o {
    /* JADX INFO: renamed from: a */
    public static int m18404a(int i7) {
        if ((i7 < 0 || i7 > 1) && (i7 < 1000 || i7 >= 1006)) {
            return 1;
        }
        return i7;
    }

    /* JADX INFO: renamed from: b */
    public static Status m18405b(int i7) {
        if (i7 == 1) {
            i7 = 13;
        }
        return new Status(i7);
    }
}
