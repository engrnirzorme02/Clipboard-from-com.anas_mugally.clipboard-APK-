package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzbzd extends ScheduledThreadPoolExecutor {
    zzbzd(int i7, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
