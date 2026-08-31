package p163V2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: V2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1730a extends AbstractC1945a {
    public static final Parcelable.Creator<C1730a> CREATOR = new C1733d();

    /* JADX INFO: renamed from: a */
    final Intent f5739a;

    public C1730a(Intent intent) {
        this.f5739a = intent;
    }

    /* JADX INFO: renamed from: T */
    public Intent m7351T() {
        return this.f5739a;
    }

    /* JADX INFO: renamed from: U */
    public String m7352U() {
        String stringExtra = this.f5739a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f5739a.getStringExtra("message_id") : stringExtra;
    }

    /* JADX INFO: renamed from: V */
    final Integer m7353V() {
        if (this.f5739a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f5739a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, this.f5739a, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
