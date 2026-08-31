package com.google.android.gms.internal.p411firebaseauthapi;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzall extends IOException {
    private boolean zza;

    public zzall(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzalo zza() {
        return new zzalo("Protocol message tag had invalid wire type.");
    }

    static zzall zzb() {
        return new zzall("Protocol message end-group tag did not match expected tag.");
    }

    static zzall zzc() {
        return new zzall("Protocol message contained an invalid tag (zero).");
    }

    static zzall zzd() {
        return new zzall("Protocol message had invalid UTF-8.");
    }

    static zzall zze() {
        return new zzall("CodedInputStream encountered a malformed varint.");
    }

    static zzall zzf() {
        return new zzall("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzall zzg() {
        return new zzall("Failed to parse the message.");
    }

    static zzall zzh() {
        return new zzall("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static zzall zzi() {
        return new zzall("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
    }

    static zzall zzj() {
        return new zzall("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    final void zzk() {
        this.zza = true;
    }

    final boolean zzl() {
        return this.zza;
    }

    public zzall(String str) {
        super(str);
    }

    public zzall(String str, IOException iOException) {
        super(str, iOException);
    }
}
