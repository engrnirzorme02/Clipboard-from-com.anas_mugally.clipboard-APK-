package p283k3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: k3.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C6027J extends AbstractC1945a {
    public static final Parcelable.Creator<C6027J> CREATOR = new C6028K();

    /* JADX INFO: renamed from: a */
    public final List f23807a;

    C6027J(List list) {
        this.f23807a = list;
    }

    /* JADX INFO: renamed from: T */
    public static C6027J m27047T(EnumC6024G... enumC6024GArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC6024GArr[0].zza()));
        return new C6027J(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        List list = this.f23807a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8074v(parcel, 1, list, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
