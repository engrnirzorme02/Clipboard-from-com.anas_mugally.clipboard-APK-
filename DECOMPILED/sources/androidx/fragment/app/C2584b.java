package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC2650l;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
final class C2584b implements Parcelable {
    public static final Parcelable.Creator<C2584b> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    final int[] f10053a;

    /* JADX INFO: renamed from: b */
    final ArrayList f10054b;

    /* JADX INFO: renamed from: c */
    final int[] f10055c;

    /* JADX INFO: renamed from: d */
    final int[] f10056d;

    /* JADX INFO: renamed from: e */
    final int f10057e;

    /* JADX INFO: renamed from: f */
    final String f10058f;

    /* JADX INFO: renamed from: r */
    final int f10059r;

    /* JADX INFO: renamed from: s */
    final int f10060s;

    /* JADX INFO: renamed from: t */
    final CharSequence f10061t;

    /* JADX INFO: renamed from: u */
    final int f10062u;

    /* JADX INFO: renamed from: v */
    final CharSequence f10063v;

    /* JADX INFO: renamed from: w */
    final ArrayList f10064w;

    /* JADX INFO: renamed from: x */
    final ArrayList f10065x;

    /* JADX INFO: renamed from: y */
    final boolean f10066y;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2584b createFromParcel(Parcel parcel) {
            return new C2584b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2584b[] newArray(int i7) {
            return new C2584b[i7];
        }
    }

    C2584b(C2583a c2583a) {
        int size = c2583a.f10342c.size();
        this.f10053a = new int[size * 6];
        if (!c2583a.f10348i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f10054b = new ArrayList(size);
        this.f10055c = new int[size];
        this.f10056d = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC2606x.a aVar = (AbstractC2606x.a) c2583a.f10342c.get(i8);
            int i9 = i7 + 1;
            this.f10053a[i7] = aVar.f10359a;
            ArrayList arrayList = this.f10054b;
            AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = aVar.f10360b;
            arrayList.add(abstractComponentCallbacksC2591i != null ? abstractComponentCallbacksC2591i.f10155f : null);
            int[] iArr = this.f10053a;
            iArr[i9] = aVar.f10361c ? 1 : 0;
            iArr[i7 + 2] = aVar.f10362d;
            iArr[i7 + 3] = aVar.f10363e;
            int i10 = i7 + 5;
            iArr[i7 + 4] = aVar.f10364f;
            i7 += 6;
            iArr[i10] = aVar.f10365g;
            this.f10055c[i8] = aVar.f10366h.ordinal();
            this.f10056d[i8] = aVar.f10367i.ordinal();
        }
        this.f10057e = c2583a.f10347h;
        this.f10058f = c2583a.f10350k;
        this.f10059r = c2583a.f10051v;
        this.f10060s = c2583a.f10351l;
        this.f10061t = c2583a.f10352m;
        this.f10062u = c2583a.f10353n;
        this.f10063v = c2583a.f10354o;
        this.f10064w = c2583a.f10355p;
        this.f10065x = c2583a.f10356q;
        this.f10066y = c2583a.f10357r;
    }

    /* JADX INFO: renamed from: a */
    private void m12032a(C2583a c2583a) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= this.f10053a.length) {
                c2583a.f10347h = this.f10057e;
                c2583a.f10350k = this.f10058f;
                c2583a.f10348i = true;
                c2583a.f10351l = this.f10060s;
                c2583a.f10352m = this.f10061t;
                c2583a.f10353n = this.f10062u;
                c2583a.f10354o = this.f10063v;
                c2583a.f10355p = this.f10064w;
                c2583a.f10356q = this.f10065x;
                c2583a.f10357r = this.f10066y;
                return;
            }
            AbstractC2606x.a aVar = new AbstractC2606x.a();
            int i9 = i7 + 1;
            aVar.f10359a = this.f10053a[i7];
            if (AbstractC2599q.m12289I0(2)) {
                Log.v("FragmentManager", "Instantiate " + c2583a + " op #" + i8 + " base fragment #" + this.f10053a[i9]);
            }
            aVar.f10366h = AbstractC2650l.b.values()[this.f10055c[i8]];
            aVar.f10367i = AbstractC2650l.b.values()[this.f10056d[i8]];
            int[] iArr = this.f10053a;
            int i10 = i7 + 2;
            if (iArr[i9] == 0) {
                z7 = false;
            }
            aVar.f10361c = z7;
            int i11 = iArr[i10];
            aVar.f10362d = i11;
            int i12 = iArr[i7 + 3];
            aVar.f10363e = i12;
            int i13 = i7 + 5;
            int i14 = iArr[i7 + 4];
            aVar.f10364f = i14;
            i7 += 6;
            int i15 = iArr[i13];
            aVar.f10365g = i15;
            c2583a.f10343d = i11;
            c2583a.f10344e = i12;
            c2583a.f10345f = i14;
            c2583a.f10346g = i15;
            c2583a.m12508e(aVar);
            i8++;
        }
    }

    /* JADX INFO: renamed from: b */
    public C2583a m12033b(AbstractC2599q abstractC2599q) {
        C2583a c2583a = new C2583a(abstractC2599q);
        m12032a(c2583a);
        c2583a.f10051v = this.f10059r;
        for (int i7 = 0; i7 < this.f10054b.size(); i7++) {
            String str = (String) this.f10054b.get(i7);
            if (str != null) {
                ((AbstractC2606x.a) c2583a.f10342c.get(i7)).f10360b = abstractC2599q.m12373e0(str);
            }
        }
        c2583a.m12025t(1);
        return c2583a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f10053a);
        parcel.writeStringList(this.f10054b);
        parcel.writeIntArray(this.f10055c);
        parcel.writeIntArray(this.f10056d);
        parcel.writeInt(this.f10057e);
        parcel.writeString(this.f10058f);
        parcel.writeInt(this.f10059r);
        parcel.writeInt(this.f10060s);
        TextUtils.writeToParcel(this.f10061t, parcel, 0);
        parcel.writeInt(this.f10062u);
        TextUtils.writeToParcel(this.f10063v, parcel, 0);
        parcel.writeStringList(this.f10064w);
        parcel.writeStringList(this.f10065x);
        parcel.writeInt(this.f10066y ? 1 : 0);
    }

    C2584b(Parcel parcel) {
        this.f10053a = parcel.createIntArray();
        this.f10054b = parcel.createStringArrayList();
        this.f10055c = parcel.createIntArray();
        this.f10056d = parcel.createIntArray();
        this.f10057e = parcel.readInt();
        this.f10058f = parcel.readString();
        this.f10059r = parcel.readInt();
        this.f10060s = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10061t = (CharSequence) creator.createFromParcel(parcel);
        this.f10062u = parcel.readInt();
        this.f10063v = (CharSequence) creator.createFromParcel(parcel);
        this.f10064w = parcel.createStringArrayList();
        this.f10065x = parcel.createStringArrayList();
        this.f10066y = parcel.readInt() != 0;
    }
}
