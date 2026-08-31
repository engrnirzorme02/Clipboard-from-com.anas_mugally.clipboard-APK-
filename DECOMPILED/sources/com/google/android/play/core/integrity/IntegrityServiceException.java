package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.integrity.model.C4742a;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class IntegrityServiceException extends C3554b {

    /* JADX INFO: renamed from: a */
    private final Throwable f18231a;

    IntegrityServiceException(int i7, Throwable th) {
        super(new Status(i7, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i7), C4742a.m21876a(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f18231a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f18231a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
