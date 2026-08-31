package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3718s;
import p170W2.AbstractC1845j;

/* JADX INFO: renamed from: com.google.android.gms.dynamic.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3774c {
    private final String zza;
    private Object zzb;

    /* JADX INFO: renamed from: com.google.android.gms.dynamic.c$a */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected AbstractC3774c(String str) {
        this.zza = str;
    }

    protected abstract Object getRemoteCreator(IBinder iBinder);

    protected final Object getRemoteCreatorInstance(Context context) throws a {
        if (this.zzb == null) {
            AbstractC3718s.m18083l(context);
            Context contextM7632d = AbstractC1845j.m7632d(context);
            if (contextM7632d == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) contextM7632d.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e7) {
                throw new a("Could not load creator class.", e7);
            } catch (IllegalAccessException e8) {
                throw new a("Could not access creator.", e8);
            } catch (InstantiationException e9) {
                throw new a("Could not instantiate creator.", e9);
            }
        }
        return this.zzb;
    }
}
