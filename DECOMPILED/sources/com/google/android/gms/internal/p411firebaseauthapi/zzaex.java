package com.google.android.gms.internal.p411firebaseauthapi;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public class zzaex {
    private zzaex() {
    }

    public static Object zza(String str, Type type) throws zzacn {
        if (type == String.class) {
            try {
                zzagt zzagtVar = (zzagt) new zzagt().zza(str);
                if (zzagtVar.zzb()) {
                    return zzagtVar.zza();
                }
                throw new zzacn("No error message: " + str);
            } catch (Exception e7) {
                throw new zzacn("Json conversion failed! " + e7.getMessage(), e7);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzaez) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
            } catch (Exception e8) {
                throw new zzacn("Json conversion failed! " + e8.getMessage(), e8);
            }
        } catch (Exception e9) {
            throw new zzacn("Instantiation of JsonResponse failed! " + String.valueOf(type), e9);
        }
    }
}
