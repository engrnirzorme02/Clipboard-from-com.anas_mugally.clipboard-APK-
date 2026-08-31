package p259h3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: h3.H */
/* JADX INFO: loaded from: classes.dex */
public class C5569H extends AbstractC1945a {
    public static final Parcelable.Creator<C5569H> CREATOR = new C5622o0();

    /* JADX INFO: renamed from: a */
    private final List f21454a;

    C5569H(List list) {
        this.f21454a = list;
    }

    /* JADX INFO: renamed from: T */
    public List m25000T() {
        return this.f21454a;
    }

    /* JADX INFO: renamed from: U */
    public final JSONArray m25001U() {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.f21454a != null) {
                for (int i7 = 0; i7 < this.f21454a.size(); i7++) {
                    C5571I c5571i = (C5571I) this.f21454a.get(i7);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) c5571i.m25003U());
                    jSONArray2.put((int) c5571i.m25002T());
                    jSONArray2.put((int) c5571i.m25003U());
                    jSONArray.put(i7, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e7);
        }
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C5569H)) {
            return false;
        }
        C5569H c5569h = (C5569H) obj;
        List list2 = this.f21454a;
        if (list2 == null && c5569h.f21454a == null) {
            return true;
        }
        return list2 != null && (list = c5569h.f21454a) != null && list2.containsAll(list) && c5569h.f21454a.containsAll(this.f21454a);
    }

    public int hashCode() {
        List list = this.f21454a;
        return AbstractC3714q.m18054c(list == null ? null : new HashSet(list));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, m25000T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
