package p197a1;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AbstractActivityC2242c;
import androidx.appcompat.app.DialogInterfaceC2241b;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import org.json.JSONException;
import org.json.JSONObject;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p220c6.AbstractC3025a;
import p225d1.C5209a;
import p225d1.C5211c;
import p238e6.InterfaceC5371p;
import p257h1.C5551c;
import p302m6.AbstractC6406h;
import p302m6.C6402d;
import p318o6.AbstractC6615I0;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.C6689s0;
import p318o6.InterfaceC6624N;
import p405z3.C7611b;

/* JADX INFO: renamed from: a1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2184c {

    /* JADX INFO: renamed from: b */
    public static final b f7064b = new b(null);

    /* JADX INFO: renamed from: c */
    private static final int f7065c = 1212;

    /* JADX INFO: renamed from: d */
    private static final int f7066d = 2121;

    /* JADX INFO: renamed from: e */
    private static final String f7067e = "categoryName";

    /* JADX INFO: renamed from: f */
    private static final String f7068f = "pass";

    /* JADX INFO: renamed from: g */
    private static final String f7069g = "order";

    /* JADX INFO: renamed from: h */
    private static final String f7070h = "isLocked";

    /* JADX INFO: renamed from: i */
    private static final String f7071i = "allowBiometric";

    /* JADX INFO: renamed from: j */
    private static final String f7072j = "name";

    /* JADX INFO: renamed from: k */
    private static final String f7073k = "category";

    /* JADX INFO: renamed from: l */
    private static final String f7074l = "time";

    /* JADX INFO: renamed from: m */
    private static final String f7075m = "orderPin";

    /* JADX INFO: renamed from: n */
    private static final String f7076n = "textTitle";

    /* JADX INFO: renamed from: o */
    private static final String f7077o = "isUploaded";

    /* JADX INFO: renamed from: p */
    private static final String f7078p = "id";

    /* JADX INFO: renamed from: q */
    private static final String f7079q = "textContent";

    /* JADX INFO: renamed from: r */
    private static final String f7080r = "notes";

    /* JADX INFO: renamed from: s */
    private static final String f7081s = "category";

    /* JADX INFO: renamed from: t */
    private static final String f7082t = "pass";

    /* JADX INFO: renamed from: u */
    private static final String f7083u = "clipZ";

    /* JADX INFO: renamed from: a */
    private final AbstractActivityC2242c f7084a;

    /* JADX INFO: renamed from: a1.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final int f7085a;

        /* JADX INFO: renamed from: b */
        private final int f7086b;

        /* JADX INFO: renamed from: c */
        private final String f7087c;

        /* JADX INFO: renamed from: d */
        private final String f7088d;

        public a(int i7, int i8, String fileName, String backupTime) {
            AbstractC6118n.m27187e(fileName, "fileName");
            AbstractC6118n.m27187e(backupTime, "backupTime");
            this.f7085a = i7;
            this.f7086b = i8;
            this.f7087c = fileName;
            this.f7088d = backupTime;
        }

        /* JADX INFO: renamed from: a */
        public final String m8899a() {
            return this.f7088d;
        }

        /* JADX INFO: renamed from: b */
        public final String m8900b() {
            return this.f7087c;
        }

        /* JADX INFO: renamed from: c */
        public final int m8901c() {
            return this.f7085a;
        }

        /* JADX INFO: renamed from: d */
        public final int m8902d() {
            return this.f7086b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7085a == aVar.f7085a && this.f7086b == aVar.f7086b && AbstractC6118n.m27183a(this.f7087c, aVar.f7087c) && AbstractC6118n.m27183a(this.f7088d, aVar.f7088d);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f7085a) * 31) + Integer.hashCode(this.f7086b)) * 31) + this.f7087c.hashCode()) * 31) + this.f7088d.hashCode();
        }

        public String toString() {
            return "BackupSummary(totalCategories=" + this.f7085a + ", totalNotes=" + this.f7086b + ", fileName=" + this.f7087c + ", backupTime=" + this.f7088d + ')';
        }
    }

    /* JADX INFO: renamed from: a1.c$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m8903a() {
            return C2184c.f7067e;
        }

        /* JADX INFO: renamed from: b */
        public final int m8904b() {
            return C2184c.f7065c;
        }

        /* JADX INFO: renamed from: c */
        public final int m8905c() {
            return C2184c.f7066d;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a1.c$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final int f7089a;

        /* JADX INFO: renamed from: b */
        private final int f7090b;

        /* JADX INFO: renamed from: c */
        private final int f7091c;

        /* JADX INFO: renamed from: d */
        private final int f7092d;

        /* JADX INFO: renamed from: e */
        private final int f7093e;

        /* JADX INFO: renamed from: f */
        private final List f7094f;

        /* JADX INFO: renamed from: g */
        private final List f7095g;

        /* JADX INFO: renamed from: h */
        private final List f7096h;

        public c(int i7, int i8, int i9, int i10, int i11, List newCategoryIds, List skippedCategoryNames, List modifiedCategoryNames) {
            AbstractC6118n.m27187e(newCategoryIds, "newCategoryIds");
            AbstractC6118n.m27187e(skippedCategoryNames, "skippedCategoryNames");
            AbstractC6118n.m27187e(modifiedCategoryNames, "modifiedCategoryNames");
            this.f7089a = i7;
            this.f7090b = i8;
            this.f7091c = i9;
            this.f7092d = i10;
            this.f7093e = i11;
            this.f7094f = newCategoryIds;
            this.f7095g = skippedCategoryNames;
            this.f7096h = modifiedCategoryNames;
        }

        /* JADX INFO: renamed from: a */
        public final int m8906a() {
            return this.f7089a;
        }

        /* JADX INFO: renamed from: b */
        public final int m8907b() {
            return this.f7091c;
        }

        /* JADX INFO: renamed from: c */
        public final int m8908c() {
            return this.f7090b;
        }

        /* JADX INFO: renamed from: d */
        public final List m8909d() {
            return this.f7096h;
        }

        /* JADX INFO: renamed from: e */
        public final List m8910e() {
            return this.f7094f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f7089a == cVar.f7089a && this.f7090b == cVar.f7090b && this.f7091c == cVar.f7091c && this.f7092d == cVar.f7092d && this.f7093e == cVar.f7093e && AbstractC6118n.m27183a(this.f7094f, cVar.f7094f) && AbstractC6118n.m27183a(this.f7095g, cVar.f7095g) && AbstractC6118n.m27183a(this.f7096h, cVar.f7096h);
        }

        /* JADX INFO: renamed from: f */
        public final int m8911f() {
            return this.f7092d;
        }

        /* JADX INFO: renamed from: g */
        public final int m8912g() {
            return this.f7093e;
        }

        /* JADX INFO: renamed from: h */
        public final List m8913h() {
            return this.f7095g;
        }

        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.f7089a) * 31) + Integer.hashCode(this.f7090b)) * 31) + Integer.hashCode(this.f7091c)) * 31) + Integer.hashCode(this.f7092d)) * 31) + Integer.hashCode(this.f7093e)) * 31) + this.f7094f.hashCode()) * 31) + this.f7095g.hashCode()) * 31) + this.f7096h.hashCode();
        }

        public String toString() {
            return "ImportSummary(categoriesAdded=" + this.f7089a + ", categoriesSkipped=" + this.f7090b + ", categoriesModified=" + this.f7091c + ", notesAdded=" + this.f7092d + ", notesSkipped=" + this.f7093e + ", newCategoryIds=" + this.f7094f + ", skippedCategoryNames=" + this.f7095g + ", modifiedCategoryNames=" + this.f7096h + ')';
        }
    }

    /* JADX INFO: renamed from: a1.c$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f7097a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AppDatabase f7098b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ OutputStream f7099c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C2184c f7100d;

        /* JADX INFO: renamed from: a1.c$d$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f7101a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C2184c f7102b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ a f7103c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2184c c2184c, a aVar, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f7102b = c2184c;
                this.f7103c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f7102b, this.f7103c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f7101a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f7102b.m8867B(this.f7103c);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AppDatabase appDatabase, OutputStream outputStream, C2184c c2184c, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f7098b = appDatabase;
            this.f7099c = outputStream;
            this.f7100d = c2184c;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new d(this.f7098b, this.f7099c, this.f7100d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) throws JSONException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f7097a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                List listMo14845e = this.f7098b.mo15144E().mo14845e();
                List listMo14866g = this.f7098b.mo15146G().mo14866g();
                OutputStream outputStream = this.f7099c;
                C5551c c5551cM24941c = C5551c.m24941c("YourKey", "YourSalt", new byte[16]);
                JSONObject jSONObject = new JSONObject();
                C2184c c2184c = this.f7100d;
                jSONObject.put(C2184c.f7082t, "00000");
                jSONObject.put(C2184c.f7083u, "true");
                jSONObject.put(C2184c.f7081s, c2184c.m8888r(listMo14845e));
                jSONObject.put(C2184c.f7080r, c2184c.m8889s(listMo14866g));
                C1444v c1444v = C1444v.f4971a;
                String strM24945b = c5551cM24941c.m24945b(jSONObject.toString());
                AbstractC6118n.m27186d(strM24945b, "encrypt(...)");
                byte[] bytes = strM24945b.getBytes(C6402d.f24428b);
                AbstractC6118n.m27186d(bytes, "getBytes(...)");
                outputStream.write(bytes);
                this.f7099c.close();
                a aVar = new a(listMo14845e.size(), listMo14866g.size(), "clipboard (" + C2184c.m8892v(this.f7100d, 0L, null, 3, null) + ").clipZ", C2184c.m8892v(this.f7100d, 0L, "dd/MM/yyyy - hh:mm", 1, null));
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar2 = new a(this.f7100d, aVar, null);
                this.f7097a = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar2, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: a1.c$e */
    static final class e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f7104a;

        /* JADX INFO: renamed from: b */
        int f7105b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ JSONObject f7107d;

        /* JADX INFO: renamed from: a1.c$e$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f7108a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6099B f7109b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C2184c f7110c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6099B c6099b, C2184c c2184c, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f7109b = c6099b;
                this.f7110c = c2184c;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f7109b, this.f7110c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f7108a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f7109b.f23859a = this.f7110c.m8869D();
                return C1444v.f4971a;
            }
        }

        /* JADX INFO: renamed from: a1.c$e$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f7111a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6099B f7112b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C2184c f7113c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ c f7114d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C6099B c6099b, C2184c c2184c, c cVar, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f7112b = c6099b;
                this.f7113c = c2184c;
                this.f7114d = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new b(this.f7112b, this.f7113c, this.f7114d, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f7111a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                ((DialogInterfaceC2241b) this.f7112b.f23859a).dismiss();
                this.f7113c.m8870E(this.f7114d);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JSONObject jSONObject, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f7107d = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C2184c.this.new e(this.f7107d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
        
            if (p318o6.AbstractC6668i.m28186g(r3, r4, r8) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws JSONException {
            C6099B c6099b;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f7105b;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C6099B c6099b2 = new C6099B();
                AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
                a aVar = new a(c6099b2, C2184c.this, null);
                this.f7104a = c6099b2;
                this.f7105b = 1;
                if (AbstractC6668i.m28186g(abstractC6615I0M28164c, aVar, this) != objE) {
                    c6099b = c6099b2;
                }
                return objE;
            }
            if (i7 == 1) {
                c6099b = (C6099B) this.f7104a;
                AbstractC1437o.m6082b(obj);
            } else if (i7 == 2) {
                c6099b = (C6099B) this.f7104a;
                AbstractC1437o.m6082b(obj);
                AbstractC6615I0 abstractC6615I0M28164c2 = C6656c0.m28164c();
                b bVar = new b(c6099b, C2184c.this, (c) obj, null);
                this.f7104a = null;
                this.f7105b = 3;
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
            C2184c c2184c = C2184c.this;
            JSONObject jSONObject = this.f7107d;
            this.f7104a = c6099b;
            this.f7105b = 2;
            obj = c2184c.m8894z(jSONObject, this);
            if (obj != objE) {
                AbstractC6615I0 abstractC6615I0M28164c3 = C6656c0.m28164c();
                b bVar2 = new b(c6099b, C2184c.this, (c) obj, null);
                this.f7104a = null;
                this.f7105b = 3;
            }
            return objE;
        }
    }

    public C2184c(AbstractActivityC2242c context) {
        AbstractC6118n.m27187e(context, "context");
        this.f7084a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final void m8867B(a aVar) {
        String string = this.f7084a.getString(R.string.backup_details_message, Integer.valueOf(aVar.m8901c()), Integer.valueOf(aVar.m8902d()), aVar.m8900b(), aVar.m8899a());
        AbstractC6118n.m27186d(string, "getString(...)");
        new C7611b(this.f7084a).mo9116t(this.f7084a.getString(R.string.backup_success_title)).mo9105i(string).m33352C(R.drawable.qq_refresh_success).mo9112p(this.f7084a.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: a1.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C2184c.m8868C(dialogInterface, i7);
            }
        }).mo9100d(false).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m8868C(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final DialogInterfaceC2241b m8869D() {
        C7611b c7611bMo9116t = new C7611b(this.f7084a).mo9116t(this.f7084a.getString(R.string.backup_progress));
        ProgressBar progressBar = new ProgressBar(this.f7084a);
        progressBar.setPadding(50, 50, 50, 50);
        DialogInterfaceC2241b dialogInterfaceC2241bM9118v = c7611bMo9116t.mo9117u(progressBar).mo9100d(false).m9118v();
        AbstractC6118n.m27186d(dialogInterfaceC2241bM9118v, "show(...)");
        return dialogInterfaceC2241bM9118v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final void m8870E(c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7084a.getString(R.string.import_success_message));
        sb.append('\n');
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.import_details));
        sb.append('\n');
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.sections_section));
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.new_sections, Integer.valueOf(cVar.m8906a())));
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.skipped_sections, Integer.valueOf(cVar.m8908c())));
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.modified_sections, Integer.valueOf(cVar.m8907b())));
        sb.append('\n');
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.notes_section));
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.new_notes, Integer.valueOf(cVar.m8911f())));
        sb.append('\n');
        sb.append(this.f7084a.getString(R.string.skipped_notes, Integer.valueOf(cVar.m8912g())));
        sb.append('\n');
        if (!cVar.m8910e().isEmpty()) {
            sb.append('\n');
            sb.append(this.f7084a.getString(R.string.newly_created_sections));
            sb.append('\n');
            Iterator it = cVar.m8909d().iterator();
            while (it.hasNext()) {
                sb.append(this.f7084a.getString(R.string.bullet_item, (String) it.next()));
                sb.append('\n');
            }
        }
        if (!cVar.m8913h().isEmpty()) {
            sb.append('\n');
            sb.append(this.f7084a.getString(R.string.skipped_sections_exist));
            sb.append('\n');
            Iterator it2 = cVar.m8913h().iterator();
            while (it2.hasNext()) {
                sb.append(this.f7084a.getString(R.string.bullet_item, (String) it2.next()));
                sb.append('\n');
            }
        }
        new C7611b(this.f7084a).mo9116t(this.f7084a.getString(R.string.import_success_title)).mo9105i(sb.toString()).m33352C(R.drawable.qq_refresh_success).mo9112p(this.f7084a.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: a1.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                C2184c.m8871F(dialogInterface, i7);
            }
        }).mo9100d(false).m9118v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m8871F(DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: q */
    private final String m8887q(List list) {
        String strValueOf;
        do {
            strValueOf = String.valueOf(System.currentTimeMillis());
        } while (list.contains(strValueOf));
        return strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final JSONObject m8888r(List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1638q.m6773r();
            }
            C5209a c5209a = (C5209a) obj;
            String strValueOf = String.valueOf(i7);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(f7067e, c5209a.m24098d());
            jSONObject2.put(f7072j, c5209a.m24099e());
            jSONObject2.put(f7070h, c5209a.m24102h());
            jSONObject2.put(f7069g, c5209a.m24100f());
            jSONObject2.put(f7068f, c5209a.m24101g());
            C1444v c1444v = C1444v.f4971a;
            jSONObject.put(strValueOf, jSONObject2);
            i7 = i8;
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final JSONObject m8889s(List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int i7 = 0;
        for (Object obj : list) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1638q.m6773r();
            }
            C5211c c5211c = (C5211c) obj;
            String strValueOf = String.valueOf(i7);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(f7079q, c5211c.m24112f());
            jSONObject2.put(f7073k, c5211c.m24109c());
            jSONObject2.put(f7078p, c5211c.m24110d());
            jSONObject2.put(f7077o, c5211c.m24115i());
            jSONObject2.put(f7076n, c5211c.m24113g());
            jSONObject2.put(f7074l, c5211c.m24114h());
            jSONObject2.put(f7075m, c5211c.m24111e());
            C1444v c1444v = C1444v.f4971a;
            jSONObject.put(strValueOf, jSONObject2);
            i7 = i8;
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: t */
    private final C5209a m8890t(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString(f7067e);
            AbstractC6118n.m27186d(string, "getString(...)");
            int i7 = jSONObject.getInt(f7069g);
            boolean z7 = jSONObject.getBoolean(f7070h);
            String string2 = jSONObject.getString(f7068f);
            AbstractC6118n.m27186d(string2, "getString(...)");
            return new C5209a(string, i7, z7, string2, false, jSONObject.getString(f7072j));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    private final String m8891u(long j7, String str) {
        String str2 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j7));
        AbstractC6118n.m27186d(str2, "format(...)");
        return str2;
    }

    /* JADX INFO: renamed from: v */
    static /* synthetic */ String m8892v(C2184c c2184c, long j7, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = System.currentTimeMillis();
        }
        if ((i7 & 2) != 0) {
            str = "dd-MM-yyyy-hh:mm";
        }
        return c2184c.m8891u(j7, str);
    }

    /* JADX INFO: renamed from: w */
    private final C5211c m8893w(JSONObject jSONObject) {
        try {
            int i7 = jSONObject.getInt(f7078p);
            long j7 = jSONObject.getLong(f7074l);
            String string = jSONObject.getString(f7076n);
            String string2 = jSONObject.getString(f7079q);
            AbstractC6118n.m27186d(string2, "getString(...)");
            String string3 = jSONObject.getString(f7073k);
            AbstractC6118n.m27186d(string3, "getString(...)");
            return new C5211c(i7, j7, string, string2, string3, jSONObject.getLong(f7075m), jSONObject.getBoolean(f7077o));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:59:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0272  */
    /* JADX WARN: Code duplicated, block: B:90:0x027f  */
    /* JADX INFO: renamed from: z */
    public final Object m8894z(JSONObject jSONObject, InterfaceC1875e interfaceC1875e) throws JSONException {
        JSONObject jSONObject2;
        int i7;
        List list;
        List list2;
        Object obj;
        Object next;
        Object next2;
        C5209a c5209a;
        C2184c c2184c = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AppDatabase appDatabaseM15148b = AppDatabase.f12597p.m15148b(c2184c.f7084a);
        List listMo14845e = appDatabaseM15148b.mo15144E().mo14845e();
        List listMo14866g = appDatabaseM15148b.mo15146G().mo14866g();
        JSONObject jSONObject3 = jSONObject.getJSONObject(f7081s);
        int length = jSONObject3.length();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            if (jSONObject3.has(String.valueOf(i9))) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject(String.valueOf(i9));
                AbstractC6118n.m27184b(jSONObject4);
                C5209a c5209aM8890t = c2184c.m8890t(jSONObject4);
                if (c5209aM8890t != null) {
                    Iterator it = listMo14845e.iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            i7 = i8;
                            list2 = listMo14866g;
                            next = null;
                            break;
                        }
                        next = it.next();
                        C5209a c5209a2 = (C5209a) next;
                        i7 = i8;
                        list2 = listMo14866g;
                        if (AbstractC6118n.m27183a(c5209a2.m24099e(), c5209aM8890t.m24099e()) && AbstractC6118n.m27183a(c5209a2.m24098d(), c5209aM8890t.m24098d())) {
                            break;
                        }
                        i8 = i7;
                        listMo14866g = list2;
                    }
                    C5209a c5209a3 = (C5209a) next;
                    Iterator it2 = listMo14845e.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        Iterator it3 = it2;
                        if (AbstractC6118n.m27183a(((C5209a) next2).m24099e(), c5209aM8890t.m24099e())) {
                            break;
                        }
                        it2 = it3;
                    }
                    C5209a c5209a4 = (C5209a) next2;
                    Iterator it4 = listMo14845e.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            c5209a = c5209a4;
                            break;
                        }
                        Object next3 = it4.next();
                        Iterator it5 = it4;
                        c5209a = c5209a4;
                        if (AbstractC6118n.m27183a(((C5209a) next3).m24098d(), c5209aM8890t.m24098d())) {
                            obj = next3;
                            break;
                        }
                        c5209a4 = c5209a;
                        it4 = it5;
                    }
                    C5209a c5209a5 = (C5209a) obj;
                    String str = "";
                    if (c5209a3 != null) {
                        int i12 = i7 + 1;
                        String strM24099e = c5209aM8890t.m24099e();
                        arrayList2.add(strM24099e != null ? strM24099e : "");
                        linkedHashMap.put(c5209aM8890t.m24098d(), c5209aM8890t.m24098d());
                        list = listMo14845e;
                        i8 = i12;
                    } else if (c5209a5 == null || c5209a != null) {
                        list = listMo14845e;
                        if (c5209a != null) {
                            i8 = i7 + 1;
                            String strM24099e2 = c5209aM8890t.m24099e();
                            if (strM24099e2 == null) {
                                strM24099e2 = "";
                            }
                            arrayList2.add(strM24099e2);
                            linkedHashMap.put(c5209aM8890t.m24098d(), c5209a.m24098d());
                        } else {
                            appDatabaseM15148b.mo15144E().mo14842b(c5209aM8890t);
                            i10++;
                            linkedHashMap.put(c5209aM8890t.m24098d(), c5209aM8890t.m24098d());
                        }
                    } else {
                        ArrayList arrayList4 = new ArrayList(AbstractC1638q.m6774s(listMo14845e, 10));
                        Iterator it6 = listMo14845e.iterator();
                        while (it6.hasNext()) {
                            arrayList4.add(((C5209a) it6.next()).m24098d());
                            str = str;
                        }
                        String str2 = str;
                        String strM8887q = c2184c.m8887q(arrayList4);
                        C5209a c5209aM24095b = C5209a.m24095b(c5209aM8890t, strM8887q, 0, false, null, false, null, 62, null);
                        list = listMo14845e;
                        appDatabaseM15148b.mo15144E().mo14842b(c5209aM24095b);
                        i11++;
                        String strM24099e3 = c5209aM8890t.m24099e();
                        if (strM24099e3 == null) {
                            strM24099e3 = str2;
                        }
                        arrayList3.add(strM24099e3);
                        arrayList.add(strM8887q);
                        linkedHashMap.put(c5209aM8890t.m24098d(), strM8887q);
                    }
                } else {
                    i7 = i8;
                    list = listMo14845e;
                    list2 = listMo14866g;
                }
                i8 = i7;
            } else {
                i7 = i8;
                list = listMo14845e;
                list2 = listMo14866g;
                i8 = i7;
            }
            i9++;
            listMo14845e = list;
            listMo14866g = list2;
        }
        int i13 = i8;
        List list3 = listMo14866g;
        JSONObject jSONObject5 = jSONObject.getJSONObject(f7080r);
        int length2 = jSONObject5.length();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i16 < length2) {
            if (jSONObject5.has(String.valueOf(i16))) {
                JSONObject jSONObject6 = jSONObject5.getJSONObject(String.valueOf(i16));
                AbstractC6118n.m27184b(jSONObject6);
                C5211c c5211cM8893w = c2184c.m8893w(jSONObject6);
                if (c5211cM8893w != null) {
                    String strM24109c = (String) linkedHashMap.get(c5211cM8893w.m24109c());
                    if (strM24109c == null) {
                        strM24109c = c5211cM8893w.m24109c();
                    }
                    C5211c c5211cM24107b = C5211c.m24107b(c5211cM8893w, 0, 0L, null, null, strM24109c, 0L, false, 110, null);
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it7 = list3.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                C5211c c5211c = (C5211c) it7.next();
                                jSONObject2 = jSONObject5;
                                if (!AbstractC6118n.m27183a(c5211c.m24109c(), c5211cM24107b.m24109c()) || !AbstractC6118n.m27183a(c5211c.m24113g(), c5211cM24107b.m24113g()) || !AbstractC6118n.m27183a(c5211c.m24112f(), c5211cM24107b.m24112f())) {
                                    jSONObject5 = jSONObject2;
                                }
                            } else {
                                jSONObject2 = jSONObject5;
                                if (AbstractC3041D.m15087l(c5211cM24107b.m24112f())) {
                                    appDatabaseM15148b.mo15146G().mo14878s(c5211cM24107b);
                                    i14++;
                                }
                            }
                            i15++;
                        }
                    } else {
                        jSONObject2 = jSONObject5;
                        if (AbstractC3041D.m15087l(c5211cM24107b.m24112f())) {
                            appDatabaseM15148b.mo15146G().mo14878s(c5211cM24107b);
                            i14++;
                        } else {
                            i15++;
                        }
                    }
                } else {
                    jSONObject2 = jSONObject5;
                }
            } else {
                jSONObject2 = jSONObject5;
            }
            i16++;
            c2184c = this;
            jSONObject5 = jSONObject2;
        }
        return new c(i10, i13, i11, i14, i15, arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: A */
    public final void m8895A(Uri uri) {
        AbstractC6118n.m27187e(uri, "uri");
        InputStream inputStreamOpenInputStream = this.f7084a.getContentResolver().openInputStream(uri);
        try {
            try {
                try {
                    C5551c c5551cM24941c = C5551c.m24941c("YourKey", "YourSalt", new byte[16]);
                    AbstractC6118n.m27184b(inputStreamOpenInputStream);
                    String strM24944a = c5551cM24941c.m24944a(AbstractC6406h.m27560s(AbstractC3025a.m14998c(inputStreamOpenInputStream)));
                    AbstractC6118n.m27184b(strM24944a);
                    if (AbstractC6406h.m27589Q(strM24944a, f7083u, false, 2, null)) {
                        AbstractC6672k.m28227d(C6689s0.f24991a, null, null, new e(new JSONObject(strM24944a), null), 3, null);
                        inputStreamOpenInputStream.close();
                    } else {
                        AbstractActivityC2242c abstractActivityC2242c = this.f7084a;
                        Toast.makeText(abstractActivityC2242c, abstractActivityC2242c.getString(R.string.check_file_current), 0).show();
                        inputStreamOpenInputStream.close();
                    }
                } catch (Exception e7) {
                    AbstractActivityC2242c abstractActivityC2242c2 = this.f7084a;
                    Toast.makeText(abstractActivityC2242c2, abstractActivityC2242c2.getString(R.string.not_supported_file), 1).show();
                    e7.printStackTrace();
                    AbstractC6118n.m27184b(inputStreamOpenInputStream);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            try {
                AbstractC6118n.m27184b(inputStreamOpenInputStream);
                inputStreamOpenInputStream.close();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m8896p(OutputStream outputStream) {
        AbstractC6118n.m27187e(outputStream, "outputStream");
        AbstractC6672k.m28227d(C6689s0.f24991a, null, null, new d(AppDatabase.f12597p.m15148b(this.f7084a), outputStream, this, null), 3, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m8897x() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/octet-stream");
        this.f7084a.startActivityForResult(intent, f7066d);
    }

    /* JADX INFO: renamed from: y */
    public final void m8898y() {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("application/octet-stream");
        intent.putExtra("android.intent.extra.TITLE", "clipboard (" + m8892v(this, 0L, null, 3, null) + ").clipZ");
        this.f7084a.startActivityForResult(intent, f7065c);
    }
}
