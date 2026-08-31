package com.anas_mugally.clipboard.p221ui.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.bumptech.glide.ComponentCallbacks2C3202b;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.C4904a;
import com.google.firebase.database.C4905b;
import com.google.firebase.database.C4906c;
import com.google.firebase.firestore.C4916b;
import com.google.firebase.firestore.C4924j;
import com.google.firebase.firestore.FirebaseFirestore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1440r;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p164V3.AbstractC1769n;
import p164V3.C1758c;
import p164V3.C1771p;
import p166V5.AbstractC1792a;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMyAppAdsActivity extends AbstractActivityC3130a {

    /* JADX INFO: renamed from: C0 */
    private static ArrayList f12992C0;

    /* JADX INFO: renamed from: D0 */
    private static long f12993D0;

    /* JADX INFO: renamed from: E0 */
    private static int f12994E0;

    /* JADX INFO: renamed from: F0 */
    private static boolean f12995F0;

    /* JADX INFO: renamed from: H0 */
    private static Activity f12997H0;

    /* JADX INFO: renamed from: I0 */
    private static boolean f12998I0;

    /* JADX INFO: renamed from: A0 */
    private final InterfaceC1429g f13001A0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: p1.j
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return BaseMyAppAdsActivity.m16182y3(this.f26188a);
        }
    });

    /* JADX INFO: renamed from: B0 */
    public static final C3122a f12991B0 = new C3122a(null);

    /* JADX INFO: renamed from: G0 */
    private static final List f12996G0 = new ArrayList();

    /* JADX INFO: renamed from: J0 */
    private static final String f12999J0 = "myapp_ads_videos";

    /* JADX INFO: renamed from: K0 */
    private static final ConcurrentHashMap f13000K0 = new ConcurrentHashMap();

    public static final class MyAppAdsVideoView extends VideoView implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener {

        /* JADX INFO: renamed from: a */
        private MediaPlayer f13002a;

        /* JADX INFO: renamed from: b */
        private InterfaceC3127f f13003b;

        /* JADX INFO: renamed from: c */
        private boolean f13004c;

        public MyAppAdsVideoView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13004c = true;
            setOnPreparedListener(this);
            setOnErrorListener(this);
        }

        private final void setVolume(int i7) {
            int i8 = 100 - i7;
            float fLog = (float) (((double) 1) - ((i8 > 0 ? Math.log(i8) : 0.0d) / Math.log(100)));
            MediaPlayer mediaPlayer = this.f13002a;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(fLog, fLog);
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m16189a() {
            return this.f13004c;
        }

        /* JADX INFO: renamed from: b */
        public final void m16190b() {
            setVolume(0);
            this.f13004c = true;
        }

        /* JADX INFO: renamed from: c */
        public final void m16191c() {
            this.f13004c = false;
            setVolume(100);
        }

        public final InterfaceC3127f getStartPlayListener() {
            return this.f13003b;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
            AbstractC6118n.m27187e(mediaPlayer, "mediaPlayer");
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AbstractC6118n.m27187e(mediaPlayer, "mediaPlayer");
            Log.d("anas_player", "onPrepared");
            this.f13002a = mediaPlayer;
            mediaPlayer.setLooping(true);
            m16190b();
            InterfaceC3127f interfaceC3127f = this.f13003b;
            if (interfaceC3127f != null) {
                interfaceC3127f.mo16208a();
            }
        }

        public final void setStartPlayListener(InterfaceC3127f interfaceC3127f) {
            this.f13003b = interfaceC3127f;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$a */
    public static final class C3122a {
        public /* synthetic */ C3122a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C3122a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$b */
    public static final class C3123b {

        /* JADX INFO: renamed from: a */
        private final String f13005a;

        /* JADX INFO: renamed from: b */
        private final String f13006b;

        /* JADX INFO: renamed from: c */
        private final String f13007c;

        /* JADX INFO: renamed from: d */
        private final String f13008d;

        /* JADX INFO: renamed from: e */
        private final String f13009e;

        public C3123b(String projectId, String appId, String apiKey, String databaseUrl, String storageBucket) {
            AbstractC6118n.m27187e(projectId, "projectId");
            AbstractC6118n.m27187e(appId, "appId");
            AbstractC6118n.m27187e(apiKey, "apiKey");
            AbstractC6118n.m27187e(databaseUrl, "databaseUrl");
            AbstractC6118n.m27187e(storageBucket, "storageBucket");
            this.f13005a = projectId;
            this.f13006b = appId;
            this.f13007c = apiKey;
            this.f13008d = databaseUrl;
            this.f13009e = storageBucket;
        }

        /* JADX INFO: renamed from: a */
        public final String m16192a() {
            return this.f13007c;
        }

        /* JADX INFO: renamed from: b */
        public final String m16193b() {
            return this.f13006b;
        }

        /* JADX INFO: renamed from: c */
        public final String m16194c() {
            return this.f13008d;
        }

        /* JADX INFO: renamed from: d */
        public final String m16195d() {
            return this.f13005a;
        }

        /* JADX INFO: renamed from: e */
        public final String m16196e() {
            return this.f13009e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3123b)) {
                return false;
            }
            C3123b c3123b = (C3123b) obj;
            return AbstractC6118n.m27183a(this.f13005a, c3123b.f13005a) && AbstractC6118n.m27183a(this.f13006b, c3123b.f13006b) && AbstractC6118n.m27183a(this.f13007c, c3123b.f13007c) && AbstractC6118n.m27183a(this.f13008d, c3123b.f13008d) && AbstractC6118n.m27183a(this.f13009e, c3123b.f13009e);
        }

        public int hashCode() {
            return (((((((this.f13005a.hashCode() * 31) + this.f13006b.hashCode()) * 31) + this.f13007c.hashCode()) * 31) + this.f13008d.hashCode()) * 31) + this.f13009e.hashCode();
        }

        public String toString() {
            return "FirebaseConfig(projectId=" + this.f13005a + ", appId=" + this.f13006b + ", apiKey=" + this.f13007c + ", databaseUrl=" + this.f13008d + ", storageBucket=" + this.f13009e + ')';
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$d */
    public interface InterfaceC3125d {
        /* JADX INFO: renamed from: a */
        void mo16204a(boolean z7);
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$e */
    public interface InterfaceC3126e {
        /* JADX INFO: renamed from: a */
        void m16205a();

        /* JADX INFO: renamed from: b */
        void m16206b(String str);

        /* JADX INFO: renamed from: c */
        void m16207c();
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$f */
    public interface InterfaceC3127f {
        /* JADX INFO: renamed from: a */
        void mo16208a();
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$g */
    public static final class C3128g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1792a.m7503a(Long.valueOf(((C3124c) obj2).m16200d()), Long.valueOf(((C3124c) obj).m16200d()));
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$h */
    public static final class C3129h implements InterfaceC3125d {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewGroup f13019b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f13020c;

        C3129h(ViewGroup viewGroup, int i7, InterfaceC3126e interfaceC3126e) {
            this.f13019b = viewGroup;
            this.f13020c = i7;
        }

        @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity.InterfaceC3125d
        /* JADX INFO: renamed from: a */
        public void mo16204a(boolean z7) {
            C3124c c3124cM16148J3;
            if (!z7 || (c3124cM16148J3 = BaseMyAppAdsActivity.this.m16148J3()) == null) {
                return;
            }
            BaseMyAppAdsActivity.this.m16141A3(this.f13019b, this.f13020c, c3124cM16148J3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public final void m16141A3(ViewGroup viewGroup, int i7, final C3124c c3124c, final InterfaceC3126e interfaceC3126e) {
        try {
            View viewFindViewById = viewGroup.findViewById(R.id.app_naitve);
            View viewInflate = viewFindViewById == null ? LayoutInflater.from(this).inflate(i7, (ViewGroup) null) : viewFindViewById;
            viewInflate.setVisibility(0);
            if (isDestroyed()) {
                if (interfaceC3126e != null) {
                    interfaceC3126e.m16207c();
                    return;
                }
                return;
            }
            ComponentCallbacks2C3202b.m16995u(this).m17079t(c3124c.m16202f()).m17065w0((ImageView) viewInflate.findViewById(R.id.image_ad));
            if (viewInflate.findViewById(R.id.ad_media) != null || viewInflate.findViewById(R.id.ad_image_media) != null) {
                AbstractC6118n.m27184b(viewInflate);
                m16160X3(viewInflate, c3124c);
            }
            ((TextView) viewInflate.findViewById(R.id.text_title_ad)).setText(c3124c.m16199c());
            ((TextView) viewInflate.findViewById(R.id.text_description_ad)).setText(c3124c.m16198b());
            View.OnClickListener onClickListener = new View.OnClickListener(c3124c, interfaceC3126e) { // from class: p1.i

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ BaseMyAppAdsActivity.C3124c f26187b;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseMyAppAdsActivity.m16142B3(this.f26186a, this.f26187b, null, view);
                }
            };
            viewInflate.setOnClickListener(onClickListener);
            View viewFindViewById2 = viewInflate.findViewById(R.id.go_to_link);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setOnClickListener(onClickListener);
                if (viewFindViewById2 instanceof Button) {
                    ((Button) viewFindViewById2).setText(c3124c.m16197a());
                }
            }
            if (viewFindViewById == null) {
                viewGroup.removeAllViews();
                viewGroup.addView(viewInflate);
                viewGroup.setVisibility(0);
            }
            if (interfaceC3126e != null) {
                interfaceC3126e.m16205a();
            }
        } catch (Exception e7) {
            Log.e("BaseMyAppAdsActivity", "Error displaying ad: " + e7.getMessage());
            if (interfaceC3126e != null) {
                interfaceC3126e.m16207c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final void m16142B3(BaseMyAppAdsActivity baseMyAppAdsActivity, C3124c c3124c, InterfaceC3126e interfaceC3126e, View view) {
        try {
            baseMyAppAdsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c3124c.m16201e())));
            baseMyAppAdsActivity.m16149K3(c3124c.m16199c());
            if (interfaceC3126e != null) {
                interfaceC3126e.m16206b(c3124c.m16199c());
            }
        } catch (Exception e7) {
            Log.e("BaseMyAppAdsActivity", "Failed to open ad URL: " + e7.getMessage());
            if (interfaceC3126e != null) {
                interfaceC3126e.m16207c();
            }
        }
    }

    /* JADX INFO: renamed from: C3 */
    private final void m16143C3(final String str, final String str2) {
        ConcurrentHashMap concurrentHashMap = f13000K0;
        Object obj = concurrentHashMap.get(str);
        Boolean bool = Boolean.TRUE;
        if (AbstractC6118n.m27183a(obj, bool)) {
            return;
        }
        concurrentHashMap.put(str, bool);
        new Thread(new Runnable() { // from class: p1.o
            @Override // java.lang.Runnable
            public final void run() {
                BaseMyAppAdsActivity.m16144D3(this.f26196a, str, str2);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final void m16144D3(BaseMyAppAdsActivity baseMyAppAdsActivity, String str, String str2) {
        try {
            File fileM16145F3 = baseMyAppAdsActivity.m16145F3(str);
            if (fileM16145F3.exists() && fileM16145F3.length() == 0) {
                fileM16145F3.delete();
            }
            if (!fileM16145F3.exists()) {
                Log.d("BaseMyAppAdsActivity", "Downloading video: " + str);
                URLConnection uRLConnectionOpenConnection = new URL(str2).openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(15000);
                uRLConnectionOpenConnection.setReadTimeout(30000);
                InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
                FileOutputStream fileOutputStream = new FileOutputStream(fileM16145F3);
                byte[] bArr = new byte[8192];
                long j7 = 0;
                while (true) {
                    int i7 = inputStream.read(bArr);
                    if (i7 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i7);
                    j7 += (long) i7;
                }
                inputStream.close();
                fileOutputStream.close();
                if (j7 > 0) {
                    Log.d("BaseMyAppAdsActivity", "Video downloaded successfully: " + str + " (" + (j7 / ((long) 1024)) + "KB)");
                } else {
                    fileM16145F3.delete();
                    Log.w("BaseMyAppAdsActivity", "Downloaded video is empty: " + str);
                }
            }
        } catch (Exception e7) {
            Log.e("BaseMyAppAdsActivity", "Failed to download video " + str + ": " + e7.getMessage());
            File fileM16145F4 = baseMyAppAdsActivity.m16145F3(str);
            if (fileM16145F4.exists()) {
                fileM16145F4.delete();
            }
        } finally {
            f13000K0.remove(str);
        }
    }

    /* JADX INFO: renamed from: F3 */
    private final File m16145F3(String str) {
        File externalCacheDir = getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = getCacheDir();
        }
        File file = new File(externalCacheDir, f12999J0);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str + ".mp4");
    }

    /* JADX INFO: renamed from: H3 */
    private final SharedPreferences m16146H3() {
        SharedPreferences sharedPreferences = getSharedPreferences("MyAppAds_SHARED", 0);
        AbstractC6118n.m27186d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: I3 */
    private final SharedPreferences.Editor m16147I3() {
        return m16146H3().edit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public final C3124c m16148J3() {
        SharedPreferences.Editor editorPutInt;
        ArrayList arrayList = f12992C0;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        f12994E0 = f12994E0 < arrayList.size() + (-1) ? f12994E0 + 1 : 0;
        SharedPreferences.Editor editorM16147I3 = m16147I3();
        if (editorM16147I3 != null && (editorPutInt = editorM16147I3.putInt("ad_index", f12994E0)) != null) {
            editorPutInt.apply();
        }
        return (C3124c) AbstractC1638q.m6573M(arrayList, f12994E0);
    }

    /* JADX INFO: renamed from: K3 */
    private final void m16149K3(String str) {
        try {
            String packageName = getPackageName();
            AbstractC6118n.m27186d(packageName, "getPackageName(...)");
            List listG0 = AbstractC6406h.m27574G0(packageName, new String[]{"."}, false, 0, 6, null);
            C4906c c4906cM22114b = C4906c.m22114b(AbstractC1769n.m7418a(C1758c.f5790a, "myapp_ads_secondary"));
            AbstractC6118n.m27186d(c4906cM22114b, "getInstance(...)");
            final C4905b c4905bM22117d = c4906cM22114b.m22117d(((String) AbstractC1638q.m6579S(listG0)) + '/' + str);
            AbstractC6118n.m27186d(c4905bM22117d, "getReference(...)");
            Task taskM22124a = c4905bM22117d.m22124a();
            final InterfaceC5367l interfaceC5367l = new InterfaceC5367l() { // from class: p1.k
                @Override // p238e6.InterfaceC5367l
                public final Object invoke(Object obj) {
                    return BaseMyAppAdsActivity.m16150L3(c4905bM22117d, (C4904a) obj);
                }
            };
            AbstractC6118n.m27184b(taskM22124a.addOnSuccessListener(new OnSuccessListener() { // from class: p1.l
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    BaseMyAppAdsActivity.m16151M3(interfaceC5367l, obj);
                }
            }));
        } catch (Exception e7) {
            Log.e("BaseMyAppAdsActivity", "Failed to increment ad click count: " + e7.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public static final C1444v m16150L3(C4905b c4905b, C4904a c4904a) {
        try {
            AbstractC6118n.m27184b(c4905b.m22111h(AbstractC1610H.m6624f(AbstractC1440r.m6083a("count", Long.valueOf((c4904a.m22106g() ? Long.parseLong(String.valueOf(c4904a.m22100a("count").m22104e())) : 0L) + 1)))));
        } catch (Exception e7) {
            Log.e("BaseMyAppAdsActivity", "Failed to increment count: " + e7.getMessage());
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final void m16151M3(InterfaceC5367l interfaceC5367l, Object obj) {
        interfaceC5367l.invoke(obj);
    }

    /* JADX INFO: renamed from: N3 */
    private final void m16152N3() {
        try {
            if (f12998I0) {
                return;
            }
            C3123b c3123bM16185G3 = m16185G3();
            C1758c c1758c = C1758c.f5790a;
            C1771p c1771pM7427a = new C1771p.b().m7431e(c3123bM16185G3.m16195d()).m7429c(c3123bM16185G3.m16193b()).m7428b(c3123bM16185G3.m16192a()).m7430d(c3123bM16185G3.m16194c()).m7432f(c3123bM16185G3.m16196e()).m7427a();
            AbstractC6118n.m27186d(c1771pM7427a, "build(...)");
            AbstractC1769n.m7420c(c1758c, this, c1771pM7427a, "myapp_ads_secondary");
            f12998I0 = true;
            Log.d("BaseMyAppAdsActivity", "Firebase initialized successfully");
        } catch (Exception e7) {
            Log.e("BaseMyAppAdsActivity", "Failed to initialize Firebase: " + e7.getMessage());
        }
    }

    /* JADX INFO: renamed from: O3 */
    private final void m16153O3() {
        m16152N3();
    }

    /* JADX INFO: renamed from: Q3 */
    private final void m16154Q3(final InterfaceC3125d interfaceC3125d) {
        if (!m16188e4()) {
            if (interfaceC3125d != null) {
                interfaceC3125d.mo16204a(false);
                return;
            }
            return;
        }
        if (f12995F0) {
            if (interfaceC3125d != null) {
                f12996G0.add(new InterfaceC5356a() { // from class: p1.e
                    @Override // p238e6.InterfaceC5356a
                    public final Object invoke() {
                        return BaseMyAppAdsActivity.m16156S3(interfaceC3125d);
                    }
                });
                return;
            }
            return;
        }
        if (!m16167f4()) {
            Log.d("BaseMyAppAdsActivity", "Ads are already loaded and valid, skipping reload");
            if (interfaceC3125d != null) {
                interfaceC3125d.mo16204a(true);
                return;
            }
            return;
        }
        Log.d("BaseMyAppAdsActivity", "Loading MyApp ads from Firebase…");
        f12995F0 = true;
        try {
            String language = Locale.getDefault().getLanguage();
            FirebaseFirestore firebaseFirestoreM22142e = FirebaseFirestore.m22142e(AbstractC1769n.m7418a(C1758c.f5790a, "myapp_ads_secondary"));
            AbstractC6118n.m27186d(firebaseFirestoreM22142e, "getInstance(...)");
            Set setF = AbstractC1617O.m6652f("ar", "bn", "ca", "cs", "da", "de", "en", "es", "fr", "hi", "id", "it", "ja", "ko", "nl", "pt", "ru", "sk", "sv", "tr", "uk", "ur", "zh");
            C4916b c4916bM22147c = firebaseFirestoreM22142e.m22147c(m16184E3());
            if (!setF.contains(language)) {
                language = "en";
            }
            AbstractC6118n.m27184b(c4916bM22147c.m22152a(language).m22163j().addOnCompleteListener(new OnCompleteListener() { // from class: p1.h
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    BaseMyAppAdsActivity.m16157T3(interfaceC3125d, this, task);
                }
            }));
        } catch (Exception e7) {
            f12995F0 = false;
            Log.e("BaseMyAppAdsActivity", "Exception loading ads: " + e7.getMessage());
            if (interfaceC3125d != null) {
                interfaceC3125d.mo16204a(false);
            }
            m16159W3(false);
        }
    }

    /* JADX INFO: renamed from: R3 */
    static /* synthetic */ void m16155R3(BaseMyAppAdsActivity baseMyAppAdsActivity, InterfaceC3125d interfaceC3125d, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMyAppAds");
        }
        if ((i7 & 1) != 0) {
            interfaceC3125d = null;
        }
        baseMyAppAdsActivity.m16154Q3(interfaceC3125d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public static final C1444v m16156S3(InterfaceC3125d interfaceC3125d) {
        interfaceC3125d.mo16204a(f12992C0 != null);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public static final void m16157T3(InterfaceC3125d interfaceC3125d, BaseMyAppAdsActivity baseMyAppAdsActivity, Task task) {
        Map mapM22168d;
        String string;
        AbstractC6118n.m27187e(task, "task");
        f12995F0 = false;
        if (task.getException() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to load ads: ");
            Exception exception = task.getException();
            sb.append(exception != null ? exception.getMessage() : null);
            Log.e("BaseMyAppAdsActivity", sb.toString());
            if (interfaceC3125d != null) {
                interfaceC3125d.mo16204a(false);
            }
            baseMyAppAdsActivity.m16159W3(false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C4924j c4924j = (C4924j) task.getResult();
        if (c4924j != null && (mapM22168d = c4924j.m22168d()) != null) {
            for (Map.Entry entry : mapM22168d.entrySet()) {
                try {
                    Object value = entry.getValue();
                    AbstractC6118n.m27185c(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    Map map = (Map) value;
                    String strValueOf = String.valueOf(map.get("urlApp"));
                    String packageName = baseMyAppAdsActivity.getPackageName();
                    AbstractC6118n.m27186d(packageName, "getPackageName(...)");
                    boolean zQ = AbstractC6406h.m27589Q(strValueOf, packageName, false, 2, null);
                    Object obj = map.get("isEnabled");
                    if (obj == null || (string = obj.toString()) == null || Boolean.parseBoolean(string)) {
                        if (!zQ) {
                            arrayList.add(new C3124c(Long.parseLong(((String) entry.getKey()).toString()), String.valueOf(map.get("nameApp")), String.valueOf(map.get("decApp")), strValueOf, String.valueOf(map.get("urlImageApp")), String.valueOf(map.get("urlVideoApp")), String.valueOf(map.get("btnOpText")), false, 128, null));
                        }
                    }
                } catch (Exception e7) {
                    Log.e("BaseMyAppAdsActivity", "Error parsing ad: " + e7.getMessage());
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (interfaceC3125d != null) {
                interfaceC3125d.mo16204a(false);
            }
            baseMyAppAdsActivity.m16159W3(false);
            Log.d("BaseMyAppAdsActivity", "No MyApp ads available");
            return;
        }
        if (arrayList.size() > 1) {
            AbstractC1638q.m6776u(arrayList, new C3128g());
        }
        f12992C0 = arrayList;
        f12993D0 = System.currentTimeMillis();
        if (interfaceC3125d != null) {
            interfaceC3125d.mo16204a(true);
        }
        baseMyAppAdsActivity.m16159W3(true);
        Log.d("BaseMyAppAdsActivity", "Loaded " + arrayList.size() + " MyApp ads successfully (valid for 24.0h)");
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m16158V3(BaseMyAppAdsActivity baseMyAppAdsActivity, ViewGroup viewGroup, int i7, InterfaceC3126e interfaceC3126e, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMyNativeAd");
        }
        if ((i8 & 4) != 0) {
            interfaceC3126e = null;
        }
        baseMyAppAdsActivity.m16187U3(viewGroup, i7, interfaceC3126e);
    }

    /* JADX INFO: renamed from: W3 */
    private final void m16159W3(boolean z7) {
        Iterator it = f12996G0.iterator();
        while (it.hasNext()) {
            ((InterfaceC5356a) it.next()).invoke();
        }
        f12996G0.clear();
    }

    /* JADX INFO: renamed from: X3 */
    private final void m16160X3(View view, final C3124c c3124c) {
        final MyAppAdsVideoView myAppAdsVideoView = (MyAppAdsVideoView) view.findViewById(R.id.ad_media);
        final ImageView imageView = (ImageView) view.findViewById(R.id.ad_image_media);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.mute_unmute_sound);
        if (myAppAdsVideoView != null) {
            myAppAdsVideoView.setVideoURI(null);
        }
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        final InterfaceC5356a interfaceC5356a = new InterfaceC5356a() { // from class: p1.m
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return BaseMyAppAdsActivity.m16161Y3(myAppAdsVideoView, this, imageView, c3124c);
            }
        };
        if (c3124c.m16203g().length() == 0) {
            return;
        }
        File fileM16145F3 = m16145F3(String.valueOf(c3124c.m16200d()));
        if (!fileM16145F3.exists() || fileM16145F3.length() <= 0) {
            interfaceC5356a.invoke();
            m16143C3(String.valueOf(c3124c.m16200d()), c3124c.m16203g());
            return;
        }
        if (myAppAdsVideoView != null) {
            myAppAdsVideoView.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: p1.n
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer, int i7, int i8) {
                    return BaseMyAppAdsActivity.m16162Z3(interfaceC5356a, mediaPlayer, i7, i8);
                }
            });
        }
        if (myAppAdsVideoView == null || imageView == null) {
            return;
        }
        Uri uriFromFile = Uri.fromFile(fileM16145F3);
        AbstractC6118n.m27186d(uriFromFile, "fromFile(...)");
        m16163a4(myAppAdsVideoView, uriFromFile, imageView2, imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public static final C1444v m16161Y3(MyAppAdsVideoView myAppAdsVideoView, BaseMyAppAdsActivity baseMyAppAdsActivity, ImageView imageView, C3124c c3124c) {
        if (myAppAdsVideoView == null) {
            return null;
        }
        baseMyAppAdsActivity.m16183z3(myAppAdsVideoView, imageView, c3124c.m16202f());
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public static final boolean m16162Z3(InterfaceC5356a interfaceC5356a, MediaPlayer mediaPlayer, int i7, int i8) {
        interfaceC5356a.invoke();
        return true;
    }

    /* JADX INFO: renamed from: a4 */
    private final void m16163a4(final MyAppAdsVideoView myAppAdsVideoView, Uri uri, final ImageView imageView, ImageView imageView2) {
        myAppAdsVideoView.setVisibility(0);
        imageView2.setVisibility(8);
        final InterfaceC5356a interfaceC5356a = new InterfaceC5356a() { // from class: p1.p
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return BaseMyAppAdsActivity.m16164b4(imageView, myAppAdsVideoView);
            }
        };
        try {
            myAppAdsVideoView.setVideoURI(uri);
            myAppAdsVideoView.setAudioFocusRequest(0);
            myAppAdsVideoView.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(256).build());
            interfaceC5356a.invoke();
            myAppAdsVideoView.setStartPlayListener(new InterfaceC3127f() { // from class: p1.f
                @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity.InterfaceC3127f
                /* JADX INFO: renamed from: a */
                public final void mo16208a() {
                    BaseMyAppAdsActivity.m16165c4(imageView, myAppAdsVideoView, interfaceC5356a);
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public static final C1444v m16164b4(ImageView imageView, MyAppAdsVideoView myAppAdsVideoView) {
        if (imageView == null) {
            return null;
        }
        imageView.setImageResource(myAppAdsVideoView.m16189a() ? R.drawable.ic_round_volume_off_24 : R.drawable.ic_round_volume_up_24);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final void m16165c4(ImageView imageView, final MyAppAdsVideoView myAppAdsVideoView, final InterfaceC5356a interfaceC5356a) {
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: p1.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseMyAppAdsActivity.m16166d4(myAppAdsVideoView, interfaceC5356a, view);
                }
            });
        }
        myAppAdsVideoView.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public static final void m16166d4(MyAppAdsVideoView myAppAdsVideoView, InterfaceC5356a interfaceC5356a, View view) {
        if (myAppAdsVideoView.m16189a()) {
            myAppAdsVideoView.m16191c();
        } else {
            myAppAdsVideoView.m16190b();
        }
        interfaceC5356a.invoke();
    }

    /* JADX INFO: renamed from: f4 */
    private final boolean m16167f4() {
        ArrayList arrayList = f12992C0;
        return arrayList == null || arrayList.isEmpty() || System.currentTimeMillis() - f12993D0 >= 86400000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final String m16182y3(BaseMyAppAdsActivity baseMyAppAdsActivity) {
        File externalCacheDir = baseMyAppAdsActivity.getExternalCacheDir();
        if (externalCacheDir == null) {
            externalCacheDir = baseMyAppAdsActivity.getCacheDir();
        }
        AbstractC6118n.m27184b(externalCacheDir);
        return Uri.fromFile(externalCacheDir).toString();
    }

    /* JADX INFO: renamed from: z3 */
    private final void m16183z3(VideoView videoView, ImageView imageView, String str) {
        videoView.setVideoURI(null);
        videoView.setVisibility(8);
        if (imageView != null) {
            imageView.setVisibility(0);
            if (isDestroyed()) {
                return;
            }
            ComponentCallbacks2C3202b.m16995u(this).m17079t(str).m17065w0(imageView);
        }
    }

    /* JADX INFO: renamed from: E3 */
    protected String m16184E3() {
        return "ads";
    }

    /* JADX INFO: renamed from: G3 */
    protected C3123b m16185G3() {
        return new C3123b("adsmyapp-30a32", "1:352992416145:android:e172f5e4e8e574099f0a30", "AIzaSyDyCHcHflyQrD01LwNKF-9bGtiwnUJ6Dzw", "https://adsmyapp-30a32-default-rtdb.firebaseio.com", "adsmyapp-30a32.appspot.com");
    }

    /* JADX INFO: renamed from: P3 */
    public final boolean m16186P3() {
        ArrayList arrayList = f12992C0;
        return (arrayList == null || arrayList.isEmpty() || System.currentTimeMillis() - f12993D0 >= 86400000) ? false : true;
    }

    /* JADX INFO: renamed from: U3 */
    public final void m16187U3(ViewGroup viewGroup, int i7, InterfaceC3126e interfaceC3126e) {
        AbstractC6118n.m27187e(viewGroup, "viewGroup");
        if (!m16188e4()) {
            if (interfaceC3126e != null) {
                interfaceC3126e.m16207c();
            }
        } else {
            C3124c c3124cM16148J3 = m16148J3();
            if (c3124cM16148J3 == null) {
                m16154Q3(new C3129h(viewGroup, i7, interfaceC3126e));
            } else {
                m16141A3(viewGroup, i7, c3124cM16148J3, interfaceC3126e);
            }
        }
    }

    /* JADX INFO: renamed from: e4 */
    protected boolean m16188e4() {
        return true;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f12994E0 = m16146H3().getInt("ad_index", -1);
        if (!m16188e4() || f12998I0) {
            return;
        }
        m16153O3();
    }

    @Override // androidx.appcompat.app.AbstractActivityC2242c, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        f12997H0 = this;
        if (!m16188e4() || m16186P3()) {
            return;
        }
        m16155R3(this, null, 1, null);
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ads.BaseMyAppAdsActivity$c */
    public static final class C3124c {

        /* JADX INFO: renamed from: a */
        private final long f13010a;

        /* JADX INFO: renamed from: b */
        private final String f13011b;

        /* JADX INFO: renamed from: c */
        private final String f13012c;

        /* JADX INFO: renamed from: d */
        private final String f13013d;

        /* JADX INFO: renamed from: e */
        private String f13014e;

        /* JADX INFO: renamed from: f */
        private String f13015f;

        /* JADX INFO: renamed from: g */
        private String f13016g;

        /* JADX INFO: renamed from: h */
        private boolean f13017h;

        public C3124c(long j7, String nameApp, String decApp, String urlApp, String urlImageApp, String urlVideoApp, String btnOpText, boolean z7) {
            AbstractC6118n.m27187e(nameApp, "nameApp");
            AbstractC6118n.m27187e(decApp, "decApp");
            AbstractC6118n.m27187e(urlApp, "urlApp");
            AbstractC6118n.m27187e(urlImageApp, "urlImageApp");
            AbstractC6118n.m27187e(urlVideoApp, "urlVideoApp");
            AbstractC6118n.m27187e(btnOpText, "btnOpText");
            this.f13010a = j7;
            this.f13011b = nameApp;
            this.f13012c = decApp;
            this.f13013d = urlApp;
            this.f13014e = urlImageApp;
            this.f13015f = urlVideoApp;
            this.f13016g = btnOpText;
            this.f13017h = z7;
        }

        /* JADX INFO: renamed from: a */
        public final String m16197a() {
            return this.f13016g;
        }

        /* JADX INFO: renamed from: b */
        public final String m16198b() {
            return this.f13012c;
        }

        /* JADX INFO: renamed from: c */
        public final String m16199c() {
            return this.f13011b;
        }

        /* JADX INFO: renamed from: d */
        public final long m16200d() {
            return this.f13010a;
        }

        /* JADX INFO: renamed from: e */
        public final String m16201e() {
            return this.f13013d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3124c)) {
                return false;
            }
            C3124c c3124c = (C3124c) obj;
            return this.f13010a == c3124c.f13010a && AbstractC6118n.m27183a(this.f13011b, c3124c.f13011b) && AbstractC6118n.m27183a(this.f13012c, c3124c.f13012c) && AbstractC6118n.m27183a(this.f13013d, c3124c.f13013d) && AbstractC6118n.m27183a(this.f13014e, c3124c.f13014e) && AbstractC6118n.m27183a(this.f13015f, c3124c.f13015f) && AbstractC6118n.m27183a(this.f13016g, c3124c.f13016g) && this.f13017h == c3124c.f13017h;
        }

        /* JADX INFO: renamed from: f */
        public final String m16202f() {
            return this.f13014e;
        }

        /* JADX INFO: renamed from: g */
        public final String m16203g() {
            return this.f13015f;
        }

        public int hashCode() {
            return (((((((((((((Long.hashCode(this.f13010a) * 31) + this.f13011b.hashCode()) * 31) + this.f13012c.hashCode()) * 31) + this.f13013d.hashCode()) * 31) + this.f13014e.hashCode()) * 31) + this.f13015f.hashCode()) * 31) + this.f13016g.hashCode()) * 31) + Boolean.hashCode(this.f13017h);
        }

        public String toString() {
            return "MyAppAd(timestamp=" + this.f13010a + ", nameApp=" + this.f13011b + ", decApp=" + this.f13012c + ", urlApp=" + this.f13013d + ", urlImageApp=" + this.f13014e + ", urlVideoApp=" + this.f13015f + ", btnOpText=" + this.f13016g + ", isEnabled=" + this.f13017h + ')';
        }

        public /* synthetic */ C3124c(long j7, String str, String str2, String str3, String str4, String str5, String str6, boolean z7, int i7, AbstractC6112h abstractC6112h) {
            this((i7 & 1) != 0 ? 0L : j7, (i7 & 2) != 0 ? "" : str, (i7 & 4) != 0 ? "" : str2, (i7 & 8) != 0 ? "" : str3, (i7 & 16) != 0 ? "" : str4, (i7 & 32) != 0 ? "" : str5, (i7 & 64) != 0 ? "" : str6, (i7 & 128) != 0 ? true : z7);
        }
    }
}
