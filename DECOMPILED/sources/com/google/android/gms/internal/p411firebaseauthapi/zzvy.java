package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public enum zzvy implements zzalk {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int zzi;

    zzvy(int i7) {
        this.zzi = i7;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzvy.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzalk
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzvy zza(int i7) {
        if (i7 == 0) {
            return UNKNOWN_HASH;
        }
        if (i7 == 1) {
            return SHA1;
        }
        if (i7 == 2) {
            return SHA384;
        }
        if (i7 == 3) {
            return SHA256;
        }
        if (i7 == 4) {
            return SHA512;
        }
        if (i7 != 5) {
            return null;
        }
        return SHA224;
    }
}
