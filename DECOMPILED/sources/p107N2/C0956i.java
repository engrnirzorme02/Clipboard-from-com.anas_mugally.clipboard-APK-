package p107N2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.AbstractC3734a;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: N2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0956i extends zzbz {
    public static final Parcelable.Creator<C0956i> CREATOR = new C0957j();

    /* JADX INFO: renamed from: s */
    private static final HashMap f3684s;

    /* JADX INFO: renamed from: a */
    final Set f3685a;

    /* JADX INFO: renamed from: b */
    final int f3686b;

    /* JADX INFO: renamed from: c */
    private String f3687c;

    /* JADX INFO: renamed from: d */
    private int f3688d;

    /* JADX INFO: renamed from: e */
    private byte[] f3689e;

    /* JADX INFO: renamed from: f */
    private PendingIntent f3690f;

    /* JADX INFO: renamed from: r */
    private C0948a f3691r;

    static {
        HashMap map = new HashMap();
        f3684s = map;
        map.put("accountType", AbstractC3734a.a.m18122X("accountType", 2));
        map.put("status", AbstractC3734a.a.m18121W("status", 3));
        map.put("transferBytes", AbstractC3734a.a.m18118T("transferBytes", 4));
    }

    C0956i(Set set, int i7, String str, int i8, byte[] bArr, PendingIntent pendingIntent, C0948a c0948a) {
        this.f3685a = set;
        this.f3686b = i7;
        this.f3687c = str;
        this.f3688d = i8;
        this.f3689e = bArr;
        this.f3690f = pendingIntent;
        this.f3691r = c0948a;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    public final /* synthetic */ Map getFieldMappings() {
        return f3684s;
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final Object getFieldValue(AbstractC3734a.a aVar) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z == 1) {
            return Integer.valueOf(this.f3686b);
        }
        if (iM18125Z == 2) {
            return this.f3687c;
        }
        if (iM18125Z == 3) {
            return Integer.valueOf(this.f3688d);
        }
        if (iM18125Z == 4) {
            return this.f3689e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.m18125Z());
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final boolean isFieldSet(AbstractC3734a.a aVar) {
        return this.f3685a.contains(Integer.valueOf(aVar.m18125Z()));
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setDecodedBytesInternal(AbstractC3734a.a aVar, String str, byte[] bArr) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z == 4) {
            this.f3689e = bArr;
            this.f3685a.add(Integer.valueOf(iM18125Z));
        } else {
            throw new IllegalArgumentException("Field with id=" + iM18125Z + " is not known to be a byte array.");
        }
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setIntegerInternal(AbstractC3734a.a aVar, String str, int i7) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z == 3) {
            this.f3688d = i7;
            this.f3685a.add(Integer.valueOf(iM18125Z));
        } else {
            throw new IllegalArgumentException("Field with id=" + iM18125Z + " is not known to be an int.");
        }
    }

    @Override // com.google.android.gms.common.server.response.AbstractC3734a
    protected final void setStringInternal(AbstractC3734a.a aVar, String str, String str2) {
        int iM18125Z = aVar.m18125Z();
        if (iM18125Z != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(iM18125Z)));
        }
        this.f3687c = str2;
        this.f3685a.add(Integer.valueOf(iM18125Z));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        Set set = this.f3685a;
        if (set.contains(1)) {
            AbstractC1947c.m8072t(parcel, 1, this.f3686b);
        }
        if (set.contains(2)) {
            AbstractC1947c.m8044E(parcel, 2, this.f3687c, true);
        }
        if (set.contains(3)) {
            AbstractC1947c.m8072t(parcel, 3, this.f3688d);
        }
        if (set.contains(4)) {
            AbstractC1947c.m8063k(parcel, 4, this.f3689e, true);
        }
        if (set.contains(5)) {
            AbstractC1947c.m8042C(parcel, 5, this.f3690f, i7, true);
        }
        if (set.contains(6)) {
            AbstractC1947c.m8042C(parcel, 6, this.f3691r, i7, true);
        }
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
