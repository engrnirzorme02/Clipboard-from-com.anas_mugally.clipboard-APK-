package p114O2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: O2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1120c extends AbstractC1945a {
    public static final Parcelable.Creator<C1120c> CREATOR = new C1135r();

    /* JADX INFO: renamed from: a */
    private final PendingIntent f4035a;

    public C1120c(PendingIntent pendingIntent) {
        this.f4035a = (PendingIntent) AbstractC3718s.m18083l(pendingIntent);
    }

    /* JADX INFO: renamed from: T */
    public PendingIntent m4927T() {
        return this.f4035a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m4927T(), i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
