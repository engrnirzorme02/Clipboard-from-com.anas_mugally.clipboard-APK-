package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
final class zzfo implements zzfn {
    zzfo() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x002f A[RETURN] */
    @Override // com.google.android.gms.internal.fido.zzfn
    public final StackTraceElement zza(Class cls, int i7) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i8 = 3;
        boolean z7 = false;
        while (i8 < stackTrace.length) {
            if (stackTrace[i8].getClassName().equals(name)) {
                z7 = true;
            } else {
                if (z7) {
                    if (i8 != -1) {
                        return stackTrace[i8];
                    }
                    return null;
                }
                z7 = false;
            }
            i8++;
        }
        i8 = -1;
        if (i8 != -1) {
            return stackTrace[i8];
        }
        return null;
    }
}
