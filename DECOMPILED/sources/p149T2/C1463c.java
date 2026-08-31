package p149T2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: T2.c */
/* JADX INFO: loaded from: classes.dex */
public class C1463c extends AbstractC1945a {
    public static final Parcelable.Creator<C1463c> CREATOR = new C1468h();

    /* JADX INFO: renamed from: a */
    private final Bundle f5003a;

    /* JADX INFO: renamed from: b */
    private final List f5004b;

    /* JADX INFO: renamed from: c */
    private final Map f5005c;

    /* JADX INFO: renamed from: T2.c$a */
    public static class a extends AbstractC1945a {
        public static final Parcelable.Creator<a> CREATOR = new C1465e();

        /* JADX INFO: renamed from: a */
        private final byte[] f5006a;

        /* JADX INFO: renamed from: b */
        private final String f5007b;

        a(byte[] bArr, String str) {
            this.f5006a = bArr;
            this.f5007b = str;
        }

        /* JADX INFO: renamed from: T */
        public byte[] m6127T() {
            return this.f5006a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.f5006a, ((a) obj).f5006a);
        }

        public int hashCode() {
            return AbstractC3714q.m18054c(Integer.valueOf(Arrays.hashCode(this.f5006a)));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            int iM8053a = AbstractC1947c.m8053a(parcel);
            AbstractC1947c.m8063k(parcel, 1, m6127T(), false);
            AbstractC1947c.m8044E(parcel, 2, this.f5007b, false);
            AbstractC1947c.m8054b(parcel, iM8053a);
        }

        public final String zza() {
            return this.f5007b;
        }
    }

    C1463c(Bundle bundle, List list) {
        this.f5003a = bundle;
        this.f5004b = list;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            map.put(aVar.zza(), aVar);
        }
        this.f5005c = map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        Bundle bundle = this.f5003a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8062j(parcel, 1, bundle, false);
        AbstractC1947c.m8048I(parcel, 2, this.f5004b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
