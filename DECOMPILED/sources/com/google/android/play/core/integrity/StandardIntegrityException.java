package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C4743b;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class StandardIntegrityException extends C3554b {

    /* JADX INFO: renamed from: a */
    private final Throwable f18232a;

    StandardIntegrityException(int i7, Throwable th) {
        super(new Status(i7, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i7), C4743b.m21877a(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f18232a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f18232a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
