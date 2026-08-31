package p034E0;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0180k;

/* JADX INFO: renamed from: E0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0279h extends C0278g implements InterfaceC0180k {

    /* JADX INFO: renamed from: b */
    private final SQLiteStatement f1048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0279h(SQLiteStatement delegate) {
        super(delegate);
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f1048b = delegate;
    }

    @Override // p026D0.InterfaceC0180k
    /* JADX INFO: renamed from: J0 */
    public long mo912J0() {
        return this.f1048b.executeInsert();
    }

    @Override // p026D0.InterfaceC0180k
    /* JADX INFO: renamed from: y */
    public int mo913y() {
        return this.f1048b.executeUpdateDelete();
    }
}
