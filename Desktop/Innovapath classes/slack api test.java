package getMethod;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;

public class FileList {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClientProtocolException, IOException, JSONException {

		HttpClient http = HttpClientBuilder.create().build();
		// HttpParams- build request params
		HttpGet req = new HttpGet(
				"https://slack.com/api/files.list?token=xoxp-135016942772-134260095953-137366649636-f4b0dad68bb6938e4d4173faabae2e97&types=image&pretty=1");
		req.addHeader("content-type", "image/json");
		req.addHeader("Accept-Language", "application/json");

		HttpResponse response = http.execute(req);
		int statusCode = response.getStatusLine().getStatusCode();
		System.out.println("status code is:" + statusCode);
		Assert.assertTrue(200 == statusCode);

		JSONObject json = new JSONObject(IOUtils.toString(response.getEntity().getContent()));
		System.out.println("response " + json);
		
		JSONArray files = (JSONArray)json.get("files");
		for (int i = 0; i < files.length(); i++) { 
			JSONObject object = files.getJSONObject(i);
		
//		JSONArray jsonMainArr = json.getJSONArray("files");
//		for (int i = 0; i < jsonMainArr.length(); i++) { // **line 2**
//			JSONObject object = jsonMainArr.getJSONObject(i);
			String file = object.getString("filetype");
			String id = object.getString("id");
			System.out.println(file);
			System.out.println(id);

			Assert.assertEquals("F43E2G3JN", object.get("id"));
			Assert.assertEquals("png", object.get("filetype"));
			System.out.println("Yes the filetype has png");
			Assert.assertTrue(object.has("pretty_type"));
			System.out.println("Yes the file has pretty type");

		}

	}

}
