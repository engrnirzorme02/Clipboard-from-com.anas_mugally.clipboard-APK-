package p174X;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: X.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1900d extends IOException {
    public /* synthetic */ C1900d(String str, Throwable th, int i7, AbstractC6112h abstractC6112h) {
        this(str, (i7 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1900d(String message, Throwable th) {
        super(message, th);
        AbstractC6118n.m27187e(message, "message");
    }
}
